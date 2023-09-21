package com.rseiyu.usecase;

import org.springframework.stereotype.Service;

import com.rseiyu.domain.Cliente;
import com.rseiyu.repository.IClienteRepository;

import jakarta.validation.Valid;

@Service
public class CadastroCliente {

    private IClienteRepository clienteRepository;

    public CadastroCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrar(@Valid Cliente cliente) {
        return this.clienteRepository.insert(cliente);
    }

    public Cliente atualizar(@Valid Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public void remover(String id) {
        this.clienteRepository.deleteById(id);
    }

}
