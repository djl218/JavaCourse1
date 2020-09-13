import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            
            if (word.equals("stop")) {
                break;
            } else if (word.equals("add")) {
                System.out.print("To add: ");
                String word1 = scanner.nextLine();
                this.list.add(word1);
            } else if (word.equals("list")) {
                this.list.print();
            } else if (word.equals("remove")) {
                System.out.print("Which one is removed? ");
                String word1 = scanner.nextLine();
                int number = Integer.valueOf(word1);
                this.list.remove(number);
            }
        }
    }
}

