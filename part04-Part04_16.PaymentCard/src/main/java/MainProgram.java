import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        PaymentCard Paul = new PaymentCard(20);
        PaymentCard Matt = new PaymentCard(30);
        
        Paul.eatHeartily();
        Matt.eatAffordably();
        
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);
        
        Paul.addMoney(20);
        
        Matt.eatHeartily();
        
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);
        
        Paul.eatAffordably();
        Paul.eatAffordably();
        
        Matt.addMoney(50);
        
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);
    }
}
