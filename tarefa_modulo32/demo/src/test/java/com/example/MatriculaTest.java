package com.example;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import com.example.dao.IMatriculaDao;
import com.example.dao.MatriculaDao;
import com.example.domain.Matricula;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
    }

    @Test
    public void cadastrar() {
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
    }
}
