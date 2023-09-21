package com.rseiyu.usecase;

import org.springframework.stereotype.Service;

import com.rseiyu.domain.Produto;
import com.rseiyu.domain.Produto.Status;
import com.rseiyu.exception.EntityNotFoundException;
import com.rseiyu.repository.IProdutoRepository;

import jakarta.validation.Valid;

@Service
public class CadastroProduto {

    private IProdutoRepository produtoRepository;

    public CadastroProduto(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto cadastrar(@Valid Produto produto) {
        produto.setStatus(Status.ATIVO);
        return this.produtoRepository.insert(produto);
    }

    public Produto atualizar(@Valid Produto produto) {
        return this.produtoRepository.save(produto);
    }

    public void remover(String id) {
        Produto prod = produtoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Produto.class, "id", id));
        prod.setStatus(Status.INATIVO);
        this.produtoRepository.save(prod);
        // this.produtoRepository.deleteById(id);
    }

}
