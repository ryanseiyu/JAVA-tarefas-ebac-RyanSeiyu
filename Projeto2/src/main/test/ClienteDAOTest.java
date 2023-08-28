package main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.dao.IClienteDAO;
import main.domain.Cliente;
import main.test.dao.ClienteDaoMock;

public class ClienteDAOTest {
    
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDaoMock();
    }	

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12345678901L);
        cliente.setNome("Fulano");
        cliente.setEndereco("Rua 1");
        cliente.setNumero(1);
        cliente.setCidade("Cidade 1");
        cliente.setEstado("Estado 1");
        cliente.setTelefone(12345678901L);
        clienteDAO.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }
}
