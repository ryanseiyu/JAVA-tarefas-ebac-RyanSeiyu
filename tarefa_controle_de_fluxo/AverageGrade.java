import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            float grade = scanner.nextFloat();
            sum += grade;
        }
        float average = sum / 4;
        System.out.println("Average grade: " + average);
        if (average >= 7) {
            System.out.println("Aprovado");
        } else if (average >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
} 