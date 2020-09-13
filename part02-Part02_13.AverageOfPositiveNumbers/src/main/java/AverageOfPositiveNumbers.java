
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                numberOfNumbers = numberOfNumbers + 1;
                sumOfNumbers = sumOfNumbers + input;
            }
        }
        if (sumOfNumbers > 0) {
            double average = (double) sumOfNumbers / numberOfNumbers;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
