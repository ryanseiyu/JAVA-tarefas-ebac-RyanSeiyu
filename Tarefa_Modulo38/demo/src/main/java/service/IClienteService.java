package service;

import domain.Cliente;
import exceptions.DAOException;
import service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

}