import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            String gender;
            do {
                System.out.print("Enter gender (M/F): ");
                gender = scanner.nextLine().toUpperCase();
            } while (!gender.equals("M") && !gender.equals("F"));

            Person person = new Person(name, gender);
            people.add(person);

            System.out.println("Person added to list: " + person);
        }
        List<Person> females = people.stream()
            .filter(person -> person.getGender().equals("F"))
            .collect(Collectors.toList());

        System.out.println("List of females: " + females);
    }
}