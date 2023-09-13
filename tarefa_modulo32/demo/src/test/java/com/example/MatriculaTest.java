package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import com.example.dao.AlunoDao;
import com.example.dao.ComputadorDao;
import com.example.dao.CursoDao;
import com.example.dao.IAlunoDao;
import com.example.dao.IComputadorDao;
import com.example.dao.ICursoDao;
import com.example.dao.IMatriculaDao;
import com.example.dao.MatriculaDao;
import com.example.domain.Aluno;
import com.example.domain.Computador;
import com.example.domain.Curso;
import com.example.domain.Matricula;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;
    private ICursoDao cursoDao;
    private IAlunoDao alunoDao;
    private IComputadorDao computadorDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
        cursoDao = new CursoDao();
        alunoDao = new AlunoDao();
        computadorDao = new ComputadorDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = criarCurso("C1");
        Aluno aluno = criarAluno("A1");
        Matricula mat = new Matricula();
        mat.setCodigo("M1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat.setCurso(curso);
        mat.setAluno(aluno);

        aluno.setMatricula(mat);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());

        Matricula matBD = matriculaDao.buscarPorCodigoCurso(curso.getCodigo());
        assertNotNull(matBD);
        assertEquals(mat.getId(), matBD.getId());

        Matricula matBDObj = matriculaDao.buscarPorCurso(curso);
        assertNotNull(matBDObj);
        assertEquals(mat.getId(), matBDObj.getId());
    }

    private Aluno criarAluno(String codigo) {
        Computador comp = criarComputador("A1");
        Computador comp2 = criarComputador("A2");
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigo);
        aluno.setNome("Rodrigo");
        aluno.add(comp);
        aluno.add(comp2);
        // comp.add(aluno);
        // comp2.add(aluno);
        return alunoDao.cadastrar(aluno);
    }

    private Computador criarComputador(String codigo) {
        Computador computador = new Computador();
        computador.setCodigo(codigo);
        computador.setDescricao("Computador teste");
        return computador;
    }

    private Curso criarCurso(String codigo) {
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setDescricao("Curso teste");
        curso.setNome("Curso de Java");
        return cursoDao.cadastrar(curso);
    }
}
