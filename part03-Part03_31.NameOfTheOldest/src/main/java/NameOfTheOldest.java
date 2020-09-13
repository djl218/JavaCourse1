
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = " ";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] nameAge = input.split(",");
            if (Integer.valueOf(nameAge[1]) > oldestAge) {
                oldestAge = Integer.valueOf(nameAge[1]);
                oldestName = nameAge[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
