import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {
                System.out.print("Word: ");
                String word1 = scanner.nextLine();
                System.out.print("Translation: ");
                String word2 = scanner.nextLine();
                dictionary.add(word1, word2);
            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                String word2 = scanner.nextLine();
                String translation2 = dictionary.translate(word2);
                
                if (translation2 == (null)) {
                    System.out.println("Word " + word2 + " was not found");
                } else {
                    System.out.println("Translation: " + translation2);  
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public boolean alreadyEntered(String word) {
        if (word.equals("end")) {
            System.out.print("Bye bye!");
            return true;
        }
        
        return false;
    }
}
