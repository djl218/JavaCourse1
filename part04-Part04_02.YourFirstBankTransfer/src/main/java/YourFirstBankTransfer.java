
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account ("My account", 0.0);
        matthewAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}
