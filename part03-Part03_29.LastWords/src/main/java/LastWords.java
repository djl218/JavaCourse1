
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Please enter some words:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            System.out.println("Here is the last word entered:");
            System.out.println(pieces[pieces.length - 1]);
            System.out.println("");
            
        }

    }
}
