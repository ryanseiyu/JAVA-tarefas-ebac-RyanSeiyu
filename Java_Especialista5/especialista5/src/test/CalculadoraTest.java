package test;

import org.junit.Assert;
import org.junit.Test;

import main.Calculadora;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testAdicionar() {
        int resultado = calculadora.adicionar(2, 3);
        Assert.assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        int resultado = calculadora.subtrair(5, 3);
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        int resultado = calculadora.multiplicar(2, 3);
        Assert.assertEquals(6, resultado);
    }

    @Test
    public void testDividir() {
        int resultado = calculadora.dividir(6, 3);
        Assert.assertEquals(2, resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorZero() {
        calculadora.dividir(6, 0);
    }
}