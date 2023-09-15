package dao;

import com.example.domain.Produto;

import dao.generics.GenericDB_postgres_Dao;

public class ProdutoDao extends GenericDB_postgres_Dao<Produto, Long> implements IProdutoDao {

    public ProdutoDao() {
        super(Produto.class);
    }

}