public class PrimeiraClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        System.out.println(cliente.getEndereco());

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
