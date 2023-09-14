package dao;

import com.example.domain.Produto;

public class ProdutoDao extends GenericDao<Produto, Long> implements IProdutoDao {

    public ProdutoDao() {
        super(Produto.class);
    }

}