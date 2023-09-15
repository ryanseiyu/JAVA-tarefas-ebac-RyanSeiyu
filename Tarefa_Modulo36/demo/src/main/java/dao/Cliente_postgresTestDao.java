package dao;

import com.example.domain.Cliente;

import dao.generics.GenericDB_postgresTest_Dao;

public class Cliente_postgresTestDao extends GenericDB_postgresTest_Dao<Cliente, Long>
        implements IClienteDao<Cliente> {

    public Cliente_postgresTestDao() {
        super(Cliente.class);
    }

}