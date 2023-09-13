package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.dao.AcessorioDao;
import com.example.dao.CarroDao;
import com.example.dao.IAcessorioDao;
import com.example.dao.ICarroDao;
import com.example.dao.IMarcaDao;
import com.example.dao.MarcaDao;
import com.example.domain.Acessorio;
import com.example.domain.Carro;
import com.example.domain.Marca;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;
    private IAcessorioDao acessorioDao;

    public CarroTest() {
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrarCarro() {
        Marca marca = criarMarca("Fiat");

        Carro carro = new Carro();
        carro.setModelo("Uno");
        carro.setMarca(marca);

        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("Ar condicionado");
        acessorio1.setCodigo("A1");

        carro.add(acessorio1);

        carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }

    private Marca criarMarca(String nome) {
        Marca marca = new Marca();
        marca.setNome(nome);
        marca.setCodigo("M1");
        marcaDao.cadastrar(marca);
        return marca;
    }
}
