
public class ListaEncadeada {
    private Node inicio;
    private int tamanho;

    public ListaEncadeada() {
        inicio = null;
        tamanho = 0;
    }

    public void push(Node node) {
        if (inicio == null) {
            inicio = node;
        } else {
            Node atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(node);
        }
        tamanho++;
    }

    public Node pop() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia");
        }
        Node atual = inicio;
        Node anterior = null;
        while (atual.getProximo() != null) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (anterior == null) {
            inicio = null;
        } else {
            anterior.setProximo(null);
        }
        tamanho--;
        return atual;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            node.setProximo(inicio);
            inicio = node;
        } else {
            Node atual = inicio;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.getProximo();
            }
            node.setProximo(atual.getProximo());
            atual.setProximo(node);
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            inicio = inicio.getProximo();
        } else {
            Node atual = inicio;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.getProximo();
            }
            atual.setProximo(atual.getProximo().getProximo());
        }
        tamanho--;
    }

    public int elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        Node atual = inicio;
        for (int i = 0; i < index; i++) {
            atual = atual.getProximo();
        }
        return atual.getElemento();
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        Node atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}