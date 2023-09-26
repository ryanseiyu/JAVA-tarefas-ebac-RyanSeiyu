public class Troco {
    public static void main(String[] args) {
        int[] moedas = { 5, 2, 1 };
        int quantia = 18;
        int[] troco = calcularTroco(moedas, quantia);
        for (int i = 0; i < moedas.length; i++) {
            System.out.println(troco[i] + " moedas de " + moedas[i] + " centavos");
        }
    }

    public static int[] calcularTroco(int[] moedas, int quantia) {
        int[] troco = new int[moedas.length];
        for (int i = 0; i < moedas.length; i++) {
            troco[i] = quantia / moedas[i];
            quantia %= moedas[i];
        }
        return troco;
    }
}