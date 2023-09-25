public class App {
    public static void main(String[] args) {
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
    }
}