public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int tamanho) {
        elementos = new int[tamanho];
        topo = -1;
    }

    public void push(int elemento) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("Pilha cheia");
        }
        topo++;
        elementos[topo] = elemento;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        int elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}