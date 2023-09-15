package dao;

import com.example.domain.Cliente;

import dao.generics.GenericDB_postgres_Dao;

public class ClienteDao extends GenericDB_postgres_Dao<Cliente, Long> implements IClienteDao<Cliente> {

    public ClienteDao() {
        super(Cliente.class);
    }

}
