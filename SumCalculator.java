import java.util.Scanner;

public class Sumcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
