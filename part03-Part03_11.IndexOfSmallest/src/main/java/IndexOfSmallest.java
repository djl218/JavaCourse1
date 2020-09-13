
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList<Integer> list = new ArrayList<>();
       while (true) {
           int input = Integer.valueOf(scanner.nextLine());
           if (input == 9999) {
               System.out.println("");
               break;
            }
           list.add(input);
        }
       int smallest = list.get(0);
       
       for (int i = 0; i < list.size(); i++) {
           int number = list.get(i);
           if (smallest > number) {
               smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            int smallestIndex = list.get(i);
            if (smallest == smallestIndex) {
                System.out.println("Found at index: " + i);
            } 
        }
        
    }
}
