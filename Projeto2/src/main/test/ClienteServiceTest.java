package main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.dao.IClienteDAO;
import main.domain.Cliente;
import main.service.ClienteService;
import main.service.IClienteService;
import main.test.dao.ClienteDaoMock;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
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
    }

    @Test
    public void test() {

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }
}