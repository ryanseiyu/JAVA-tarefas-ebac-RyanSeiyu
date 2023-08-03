import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> maleList = new ArrayList<>();
        ArrayList<Person> femaleList = new ArrayList<>();

        while (true) {
            System.out.print("Enter name (or 'exit' to quit): ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                break;
            }

            System.out.print("Enter gender (M/F): ");
            String gender = scanner.nextLine();

            Person person = new Person(name, gender);
            if (gender.equalsIgnoreCase("M")) {
                maleList.add(person);
            } else if (gender.equalsIgnoreCase("F")) {
                femaleList.add(person);
            } else {
                System.out.println("Invalid gender. Please enter M or F.");
            }
        }

        System.out.println("Male List:");
        for (Person person : maleList) {
            System.out.println(person.getName());
        }

        System.out.println("Female List:");
        for (Person person : femaleList) {
            System.out.println(person.getName());
        }
    }
}
