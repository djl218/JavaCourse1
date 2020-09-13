
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestLength = 0;
        String longestName = (" ");
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] nameAge = input.split(",");
            if (nameAge[0].length() > longestLength) {
                longestLength = nameAge[0].length();
                longestName = nameAge[0];
            }
            sum = sum + Integer.valueOf(nameAge[1]);
            count++;
        }
        double average = (double) sum / count; 
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
