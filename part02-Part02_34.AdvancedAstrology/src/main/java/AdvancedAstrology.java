
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i < size) {
            printSpaces(size - 1 - i);
            printStars(i + 1);
            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = 0; 
        int oddCounter = 1;
        int j = 0;
        int base = 2;
        while (i < height) {
            printSpaces(height - 1 - i);
            printStars(oddCounter);
            oddCounter = oddCounter + 2;
            i++;
        }
        while (j < base) {
            printSpaces(height - 2);
            printStars(3);
            j++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
