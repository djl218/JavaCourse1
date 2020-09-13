
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            numberOfNumbers = numberOfNumbers + 1;
            sumOfNumbers = sumOfNumbers + input; 
        }
        double average = (double) sumOfNumbers / numberOfNumbers;
        
        System.out.println("Average of the numbers: " + average);
    }
}
