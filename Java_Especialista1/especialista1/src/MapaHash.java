public class MapaHash {
    private final int TAMANHO = 10;
    private int[] chaves;
    private int[] valores;

    public MapaHash() {
        chaves = new int[TAMANHO];
        valores = new int[TAMANHO];
    }

    private int hash(int chave) {
        return chave % TAMANHO;
    }

    public void put(int chave, int valor) {
        int indice = hash(chave);
        chaves[indice] = chave;
        valores[indice] = valor;
    }

    public int delete(int chave) {
        int indice = hash(chave);
        int valor = valores[indice];
        chaves[indice] = 0;
        valores[indice] = 0;
        return valor;
    }

    public int get(int chave) {
        int indice = hash(chave);
        return valores[indice];
    }

    public void clear() {
        for (int i = 0; i < TAMANHO; i++) {
            chaves[i] = 0;
            valores[i] = 0;
        }
    }
}