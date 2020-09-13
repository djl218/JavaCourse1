import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Birds birds = new Birds();
        
        System.out.println("Commands:");
        System.out.println("Add - adds a bird");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
        System.out.println("");
        
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String englishName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird();
                bird.addBird(englishName, latinName);
                birds.addBirdToBirds(bird);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String englishName = scan.nextLine();
                birds.observation(englishName);
            } else if (command.equals("All")) {
                birds.printBirds();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String englishName = scan.nextLine();
                birds.printBird(englishName);
            } else if (command.equals("Quit")) {
                break;
            } 
        }

    }

}
