package com.example.domain;

import java.math.BigDecimal;

import dao.Persistente;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO_QUANTIDADE")
public class Quantidade implements Persistente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_qtd_seq")
    @SequenceGenerator(name = "prod_qtd_seq", sequenceName = "sq_prod_qtd", initialValue = 1, allocationSize = 1)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Produto produto;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_venda_fk", foreignKey = @ForeignKey(name = "fk_prod_qtd_venda"), referencedColumnName = "id", nullable = false)
    private Venda venda;

    public Quantidade() {
        this.quantidade = 0;
        this.valorTotal = BigDecimal.ZERO;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void adicionar(Integer quantidade) {
        this.quantidade += quantidade;
        BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
        BigDecimal novoTotal = this.valorTotal.add(novoValor);
        this.valorTotal = novoTotal;
    }

    public void remover(Integer quantidade) {
        this.quantidade -= quantidade;
        BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
        this.valorTotal = this.valorTotal.subtract(novoValor);
    }

}
