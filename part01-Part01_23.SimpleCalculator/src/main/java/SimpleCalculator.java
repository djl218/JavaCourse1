
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        double quotient = (double) first / second;
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + difference);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + quotient);


    }
}
