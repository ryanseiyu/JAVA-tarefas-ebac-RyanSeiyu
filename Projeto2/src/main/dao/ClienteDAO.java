package main.dao;

import main.domain.Cliente;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorCPF'");
    }

    @Override
    public void excluir(Long cpf) {
        // TODO Auto-generated method stub
    }

}
