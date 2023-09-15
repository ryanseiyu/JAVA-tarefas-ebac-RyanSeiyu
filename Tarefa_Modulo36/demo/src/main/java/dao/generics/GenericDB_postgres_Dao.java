package dao.generics;

import java.io.Serializable;

import dao.Persistente;

public abstract class GenericDB_postgres_Dao<T extends Persistente, E extends Serializable>
		extends GenericDao<T, E> {

	public GenericDB_postgres_Dao(Class<T> persistenteClass) {
		super(persistenteClass, "ExemploJPA");
	}

}
