package dao;

import com.example.domain.Cliente_mysqldocker;

import dao.generics.GenericDB_mysqldocker_Dao;

public class Cliente_mysqldockerDao extends GenericDB_mysqldocker_Dao<Cliente_mysqldocker, Long>
        implements IClienteDao<Cliente_mysqldocker> {

    public Cliente_mysqldockerDao() {
        super(Cliente_mysqldocker.class);
    }

}