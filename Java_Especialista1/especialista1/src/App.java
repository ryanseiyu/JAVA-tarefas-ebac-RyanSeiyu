public class App {
    public static void main(String[] args) {
        // Teste da Pilha
        Pilha pilha = new Pilha(5);

        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // true

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("O elemento no topo da pilha é: " + pilha.top()); // 30
        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // false
        System.out.println("O tamanho da pilha é: " + pilha.size()); // 3

        int elementoRemovido = pilha.pop();
        System.out.println("O elemento removido da pilha foi: " + elementoRemovido); // 30
        System.out.println("O elemento no topo da pilha agora é: " + pilha.top()); // 20
        System.out.println("O tamanho da pilha agora é: " + pilha.size()); // 2

        // Teste da Fila
        Fila fila = new Fila(5);

        System.out.println("A fila está vazia? " + fila.isEmpty()); // true

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("O elemento na frente da fila é: " + fila.front()); // 10
        System.out.println("A fila está vazia? " + fila.isEmpty()); // false
        System.out.println("O tamanho da fila é: " + fila.size()); // 3

        int elementoDesenfileirado = fila.dequeue();
        System.out.println("O elemento desenfileirado foi: " + elementoDesenfileirado); // 10
        System.out.println("O elemento na frente da fila agora é: " + fila.front()); // 20
        System.out.println("O tamanho da fila agora é: " + fila.size()); // 2

        // Teste da Lista Encadeada
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("A lista está vazia? " + (lista.size() == 0)); // true

        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));

        System.out.println("O elemento na posição 1 da lista é: " + lista.elementAt(0)); // 10
        System.out.println("A lista está vazia? " + (lista.size() == 0)); // false
        System.out.println("O tamanho da lista é: " + lista.size()); // 3

        lista.remove(1);
        System.out.println("O elemento na posição 1 da lista agora é: " + lista.elementAt(1)); // 30
        System.out.println("O tamanho da lista agora é: " + lista.size()); // 2

        // Teste do Mapa Hash
        MapaHash mapa = new MapaHash();

        mapa.put(1, 10);
        mapa.put(2, 20);
        mapa.put(3, 30);

        System.out.println("O valor associado à chave 2 é: " + mapa.get(2)); // 20

        mapa.delete(2);
        System.out.println("O valor associado à chave 2 agora é: " + mapa.get(2)); // 0

        mapa.clear();
        System.out.println("O valor associado à chave 1 agora é: " + mapa.get(1)); // 0
    }
}