
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            int number = array[i];
            System.out.print(number + ", ");
            i++;
        }
        System.out.print(array[array.length - 1]);
    }
}
