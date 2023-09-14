package dao;

import com.example.domain.Cliente;

public class ClienteDao extends GenericDao<Cliente, Long> implements IClienteDao {

    public ClienteDao() {
        super(Cliente.class);
    }

}
