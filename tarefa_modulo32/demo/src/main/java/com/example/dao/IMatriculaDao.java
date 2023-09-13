package com.example.dao;

import com.example.domain.Curso;
import com.example.domain.Matricula;

public interface IMatriculaDao {

    Matricula cadastrar(Matricula mat);

    Matricula buscarPorCodigoCurso(String codigoCurso);

    Matricula buscarPorCurso(Curso curso);

}
