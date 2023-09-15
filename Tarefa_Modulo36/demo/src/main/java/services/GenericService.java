package services;

import java.io.Serializable;
import java.util.Collection;

import dao.Persistente;
import dao.generics.IGenericDao;
import exceptions.ChaveException;
import exceptions.DAOException;
import exceptions.RegistroException;
import exceptions.TableException;

public abstract class GenericService<T extends Persistente, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDao<T, E> dao;

    public GenericService(IGenericDao<T, E> dao) {
        this.dao = dao;
    }

    @Override
    public T cadastrar(T entity) throws ChaveException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws ChaveException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws RegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

}
