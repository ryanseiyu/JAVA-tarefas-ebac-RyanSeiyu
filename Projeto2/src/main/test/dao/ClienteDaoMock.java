package main.test.dao;

import main.dao.IClienteDAO;
import main.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO  {
    @Override
    public Boolean salvar(Cliente cliente) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        // TODO Auto-generated method stub
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {
        // TODO Auto-generated method stub
    }
    
}
