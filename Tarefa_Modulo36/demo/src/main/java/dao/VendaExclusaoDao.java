package dao;

import com.example.domain.Venda;

import dao.generics.GenericDB_postgres_Dao;
import exceptions.ChaveException;
import exceptions.DAOException;

public class VendaExclusaoDao extends GenericDB_postgres_Dao<Venda, Long> implements IVendaDao {

    public VendaExclusaoDao() {
        super(Venda.class);
    }

    @Override
    public void finalizarVenda(Venda venda) throws ChaveException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(Venda venda) throws ChaveException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public Venda consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}