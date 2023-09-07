package tests.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.rseiyu.dao.produto.IProdutoDAO;
import br.com.rseiyu.dao.produto.Produto;
import br.com.rseiyu.dao.produto.ProdutoDAO;

public class ProdutoTest {
    @Test
    public void produtoTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Xanax");

        Produto produto2 = new Produto();
        produto2.setCodigo("02");
        produto2.setNome("Rivotril");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);
        Integer qtd2 = dao.cadastrar(produto2);
        assertTrue(qtd2 == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        produtoBD.setCodigo("99");
        produtoBD.setNome("DotA 2");
        Integer countUpdate = dao.atualizar(produtoBD);
        assertTrue(countUpdate == 1);

        Produto produtoTest = dao.consultar("01");
        assertNull(produtoTest);

        Produto produtoTestExiste = dao.consultar("99");
        assertNotNull(produtoTestExiste);
        assertEquals(produtoBD.getCodigo(), produtoTestExiste.getCodigo());
        assertEquals(produtoBD.getNome(), produtoTestExiste.getNome());
        assertEquals(produtoBD.getId(), produtoTestExiste.getId());
        assertEquals(produtoBD.getCodigo(), produtoTestExiste.getCodigo());

        List<Produto> list = dao.buscarTodos();
        for (Produto cli : list) {
            dao.excluir(cli);
        }

    }
}
