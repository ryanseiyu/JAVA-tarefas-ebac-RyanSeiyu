package main;

/**
 * A classe Calculadora representa uma calculadora simples que pode realizar
 * operações básicas
 * de adição, subtração, multiplicação e divisão.
 */
public class Calculadora {
    /**
     * Realiza a operação de adição entre dois números inteiros.
     * 
     * @param a o primeiro número inteiro a ser adicionado
     * @param b o segundo número inteiro a ser adicionado
     * @return a soma dos dois números inteiros
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     * 
     * @param a o número inteiro a ser subtraído
     * @param b o número inteiro a ser subtraído de a
     * @return a diferença entre os dois números inteiros
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     * 
     * @param a o primeiro número inteiro a ser multiplicado
     * @param b o segundo número inteiro a ser multiplicado
     * @return o produto dos dois números inteiros
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     * 
     * @param a o número inteiro a ser dividido
     * @param b o número inteiro pelo qual a será dividido
     * @return o resultado da divisão entre os dois números inteiros
     * @throws IllegalArgumentException se b for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}