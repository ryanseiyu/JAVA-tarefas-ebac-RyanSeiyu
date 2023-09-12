package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.dao.IProdutoDao;
import com.example.dao.ProdutoDao;
import com.example.domain.Produto;

public class ProdutoTest {
    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("DOTA2");
        produto.setNome("Produto de Valve");
        produto.setValor(10.0);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
