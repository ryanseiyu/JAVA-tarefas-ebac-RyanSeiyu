import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes sem espaços e separados por vírgulas:");
        String input = scanner.nextLine();
        String[] names = input.split(",");
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        Collections.sort(nameList);
        System.out.println("Sorted names:");
        for (String name : nameList) {
            System.out.println(name.trim());
        }
        // scanner.close();
        
        Scanner scannerParte2 = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa e seu sexo (ie: João-M,Maria-F):");
        String inputParte2 = scannerParte2.nextLine();
        String[] personGenrePairs = inputParte2.split(",");
        HashMap<String, ArrayList<String>> genreMap = new HashMap<>();
        for (String pair : personGenrePairs) {
            String[] parts = pair.split("-");
            String name = parts[0].trim();
            String genre = parts[1].trim();
            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
            }
            genreMap.get(genre).add(name);
        }
        for (String genre : genreMap.keySet()) {
            ArrayList<String> nameListParte2 = genreMap.get(genre);
            // Collections.sort(nameListParte2);
            System.out.println("Nomes de gênero: " + genre);
            for (String name : nameListParte2) {
                System.out.println(name);
            }
        }
        // scannerParte2.close();
        
    }
}