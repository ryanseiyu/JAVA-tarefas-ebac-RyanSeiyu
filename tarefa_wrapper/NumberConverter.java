import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        Integer wrapperNum = Integer.valueOf(num);
        System.out.println("Primitive number: " + num);
        System.out.println("Wrapper number: " + wrapperNum);
    }
}