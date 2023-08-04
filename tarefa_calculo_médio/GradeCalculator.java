import java.util.Random;

public class GradeCalculator {
    public static void main(String[] args) {
        Random random = new Random();

        int grade1 = random.nextInt(11);
        int grade2 = random.nextInt(11);
        int grade3 = random.nextInt(11);
        int grade4 = random.nextInt(11);

        double average = (grade1 + grade2 + grade3 + grade4) / 4.0;
        System.out.println("The average grade is: " + average);
    }
}

public record Person(String name, int age) {
    // Record classes can have additional methods and fields
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}