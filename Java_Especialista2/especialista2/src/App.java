import java.util.HashMap;
import java.util.Scanner;

public class App {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) throws Exception {
        /*
         * Exercício 1)
         * Embora seja possível calcular o fatorial de um número acima de 100 com uma
         * solução recursiva, não é recomendado, pois o resultado será muito grande e
         * pode causar estouro de memória
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);

        /*
         * Exercício 2)
         * Nesta abordagem, usamos um HashMap para armazenar os resultados já calculados
         * e evitamos recalcular o fatorial de um número já calculado. Se o resultado já
         * estiver no HashMap, retornamos o valor armazenado. Caso contrário, calculamos
         * o fatorial normalmente e armazenamos o resultado no HashMap antes de
         * retorná-lo.
         */
        Scanner inputTopdown = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numTopdown = inputTopdown.nextInt();
        int fatorialTopdown = calcFatorialTopdown(numTopdown);
        System.out.println("O fatorial de " + numTopdown + " é " + fatorialTopdown);

        /*
         * Exercício 2)
         * Nesta abordagem, usamos um array para armazenar os resultados já calculados e
         * evitamos recalcular o fatorial de um número já calculado. Começamos com o
         * fatorial de 0 armazenado no índice 0 do array e, em seguida, usamos um loop
         * for para calcular o fatorial de cada número de 1 a n e armazená-lo no array.
         * Finalmente, retornamos o valor armazenado no índice n do array.
         */
        Scanner inputBottomup = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numBottomup = inputBottomup.nextInt();
        int fatorialBottomup = calcFatorialBottomup(numBottomup);
        System.out.println("O fatorial de " + numBottomup + " é " + fatorialBottomup);
        input.close();
        inputTopdown.close();
        inputBottomup.close();

        /*
         * Exercício 3)
         * A complexidade de tempo da solução recursiva para a série de Fibonacci é
         * exponencial, O(2^n), pois cada chamada recursiva gera duas novas chamadas.
         * Isso significa que o tempo de execução aumenta exponencialmente com o tamanho
         * do número n.
         * 
         * A complexidade de tempo da solução com programação dinâmica é linear, O(n),
         * pois cada número é calculado apenas uma vez e armazenado em um array. Isso
         * significa que o tempo de execução aumenta linearmente com o tamanho do número
         * n.
         * 
         * A solução com programação dinâmica é melhor porque evita o recalculo de
         * valores já calculados, o que reduz significativamente o tempo de execução. Na
         * solução recursiva, muitos valores são recalculados várias vezes, o que
         * aumenta muito o tempo de execução. Além disso, a solução com programação
         * dinâmica é mais fácil de entender e manter, pois usa uma abordagem iterativa
         * em vez de recursiva.
         */
    }

    public static int calcFatorialTopdown(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        int result = num * calcFatorialTopdown(num - 1);
        memo.put(num, result);
        return result;
    }

    public static int calcFatorialBottomup(int num) {
        int[] memo = new int[num + 1];
        memo[0] = 1;
        for (int i = 1; i <= num; i++) {
            memo[i] = i * memo[i - 1];
        }
        return memo[num];
    }
}