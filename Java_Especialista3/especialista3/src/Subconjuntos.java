import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {
    public static void main(String[] args) {
        int[] s = { 1, 2, 3, 4 };
        int n = 2;
        List<List<Integer>> subconjuntos = calcularSubconjuntos(s, n);
        System.out.println(subconjuntos);
    }

    public static List<List<Integer>> calcularSubconjuntos(int[] s, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        calcularSubconjuntosRecursivo(s, n, 0, new ArrayList<>(), subconjuntos);
        return subconjuntos;
    }

    private static void calcularSubconjuntosRecursivo(int[] s, int n, int indice, List<Integer> atual,
            List<List<Integer>> subconjuntos) {
        if (atual.size() == n) {
            subconjuntos.add(new ArrayList<>(atual));
            return;
        }
        for (int i = indice; i < s.length; i++) {
            atual.add(s[i]);
            calcularSubconjuntosRecursivo(s, n, i + 1, atual, subconjuntos);
            atual.remove(atual.size() - 1);
        }
    }
}