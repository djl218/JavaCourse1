
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            int hi1 = number1;
            return hi1;
        } else if (number2 > number1 && number2 > number3) {
            int hi2 = number2;
            return hi2;
        } else {
            int hi3 = number3;
            return hi3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
