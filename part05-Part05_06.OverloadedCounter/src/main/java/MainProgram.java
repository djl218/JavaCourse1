
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase(4);
        counter.increase();
        counter.decrease(2);
        counter.decrease();
        System.out.println("Here is the value on the couner: " + counter.value());
    }
}
