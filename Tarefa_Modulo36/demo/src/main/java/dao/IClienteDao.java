package dao;

import dao.generics.IGenericDao;

public interface IClienteDao<T extends Persistente> extends IGenericDao<T, Long> {

}
