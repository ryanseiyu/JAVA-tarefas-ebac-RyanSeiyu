package tests.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.rseiyu.dao.cliente.Cliente;
import br.com.rseiyu.dao.cliente.ClienteDAO;
import br.com.rseiyu.dao.cliente.IClienteDAO;

public class ClienteTest {
    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Ryan Seiyu");

        Cliente cliente2 = new Cliente();
        cliente2.setCodigo("02");
        cliente2.setNome("Nikola Tesla");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);
        Integer qtd2 = dao.cadastrar(cliente2);
        assertTrue(qtd2 == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("99");
        clienteBD.setNome("Drow Ranger");
        Integer countUpdate = dao.atualizar(clienteBD);
        assertTrue(countUpdate == 1);

        Cliente clienteTest = dao.consultar("01");
        assertNull(clienteTest);

        Cliente clienteTestExiste = dao.consultar("99");
        assertNotNull(clienteTestExiste);
        assertEquals(clienteBD.getCodigo(), clienteTestExiste.getCodigo());
        assertEquals(clienteBD.getNome(), clienteTestExiste.getNome());
        assertEquals(clienteBD.getId(), clienteTestExiste.getId());
        assertEquals(clienteBD.getCodigo(), clienteTestExiste.getCodigo());

        List<Cliente> list = dao.buscarTodos();
        for (Cliente cli : list) {
            dao.excluir(cli);
        }
    }
}
