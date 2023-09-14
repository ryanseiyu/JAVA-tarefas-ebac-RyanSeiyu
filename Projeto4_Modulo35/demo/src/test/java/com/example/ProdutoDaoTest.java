package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.example.domain.Produto;

import dao.IProdutoDao;
import dao.ProdutoDao;
import exceptions.ChaveException;
import exceptions.DAOException;
import exceptions.RegistroException;
import exceptions.TableException;

public class ProdutoDaoTest {

    private IProdutoDao produtoDao;

    public ProdutoDaoTest() {
        this.produtoDao = new ProdutoDao();
    }

    @After
    public void end() throws DAOException {
        Collection<Produto> list = produtoDao.buscarTodos();
        list.forEach(cli -> {
            try {
                produtoDao.excluir(cli);
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisar()
            throws RegistroException, TableException, DAOException, ChaveException {
        Produto produto = criarProduto("A1");
        Assert.assertNotNull(produto);
        Produto produtoDB = this.produtoDao.consultar(produto.getId());
        Assert.assertNotNull(produtoDB);
    }

    @Test
    public void salvar() throws ChaveException, DAOException {
        Produto produto = criarProduto("A2");
        Assert.assertNotNull(produto);
    }

    @Test
    public void excluir()
            throws DAOException, ChaveException, RegistroException, TableException {
        Produto produto = criarProduto("A3");
        Assert.assertNotNull(produto);
        this.produtoDao.excluir(produto);
        Produto produtoBD = this.produtoDao.consultar(produto.getId());
        assertNull(produtoBD);
    }

    @Test
    public void alterarCliente()
            throws ChaveException, DAOException, RegistroException, TableException {
        Produto produto = criarProduto("A4");
        produto.setNome("Rodrigo Pires");
        produtoDao.alterar(produto);
        Produto produtoBD = this.produtoDao.consultar(produto.getId());
        assertNotNull(produtoBD);
        Assert.assertEquals("Rodrigo Pires", produtoBD.getNome());
    }

    @Test
    public void buscarTodos() throws DAOException, ChaveException {
        criarProduto("A5");
        criarProduto("A6");
        Collection<Produto> list = produtoDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);

        for (Produto prod : list) {
            this.produtoDao.excluir(prod);
        }

        list = produtoDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 0);

    }

    private Produto criarProduto(String codigo) throws ChaveException, DAOException {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
        produtoDao.cadastrar(produto);
        return produto;
    }
}
