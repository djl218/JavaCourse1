
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        
        Package pac = new Package();
        pac.addGift(book);
        System.out.println(pac.totalWeight());

    }
}
