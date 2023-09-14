package dao;

import com.example.domain.Venda;

import exceptions.ChaveException;
import exceptions.DAOException;

public class VendaExclusaoDao extends GenericDao<Venda, Long> implements IVendaDao {

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