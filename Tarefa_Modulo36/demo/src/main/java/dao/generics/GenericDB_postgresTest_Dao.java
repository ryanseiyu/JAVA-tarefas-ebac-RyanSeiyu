package dao.generics;

import java.io.Serializable;

import dao.Persistente;

public abstract class GenericDB_postgresTest_Dao<T extends Persistente, E extends Serializable>
        extends GenericDao<T, E> {

    public GenericDB_postgresTest_Dao(Class<T> persistenteClass) {
        super(persistenteClass, "PostgresTest");
    }

}