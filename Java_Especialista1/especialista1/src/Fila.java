public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;

    public Fila(int tamanho) {
        elementos = new int[tamanho];
        inicio = 0;
        fim = -1;
    }

    public void enqueue(int elemento) {
        if (fim == elementos.length - 1) {
            throw new RuntimeException("Fila cheia");
        }
        fim++;
        elementos[fim] = elemento;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        int elemento = elementos[inicio];
        inicio++;
        return elemento;
    }

    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return elementos[fim];
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return elementos[inicio];
    }

    public int size() {
        return fim - inicio + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}