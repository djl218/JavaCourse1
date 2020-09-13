
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
 
        JokeManager manager = new JokeManager();
        manager.addJoke("jk1");
        manager.addJoke("jk2");
        manager.addJoke("jk3");
        Scanner scanner = new Scanner(System.in);
        
        UserInterface userInterface = new UserInterface(manager, scanner);
        userInterface.start();
    }
}
