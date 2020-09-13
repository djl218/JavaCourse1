

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int input) {
        int i = 0;
        while (input > i) {
            System.out.println(input);
            input--;
        }
    }
}
