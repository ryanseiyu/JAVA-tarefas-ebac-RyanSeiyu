package com.example.dao;

import com.example.domain.Curso;
import com.example.domain.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class MatriculaDao implements IMatriculaDao {

    @Override
    public Matricula cadastrar(Matricula mat) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(mat);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return mat;
    }

    @Override
    public Matricula buscarPorCodigoCurso(String codigoCurso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c.codigo = :codigoCurso");

        entityManager.getTransaction().begin();
        TypedQuery<Matricula> query = entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("codigoCurso", codigoCurso);
        Matricula matricula = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public Matricula buscarPorCurso(Curso curso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c = :curso");

        entityManager.getTransaction().begin();
        TypedQuery<Matricula> query = entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("curso", curso);
        Matricula matricula = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

}
