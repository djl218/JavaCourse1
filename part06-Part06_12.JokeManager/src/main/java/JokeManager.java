import java.util.ArrayList;
import java.util.Collections;

public class JokeManager {
    private ArrayList<String> manager;
    
    public JokeManager() {
        this.manager = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.manager.add(joke);
    }
    
    public String drawJoke() {
        Collections.shuffle(this.manager);
        if (this.manager.isEmpty()) {
            return "Jokes are in short supply.";
        }

        System.out.println(this.manager.get(0));
        return this.manager.get(0);
    }
    
    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke : this.manager) {
            System.out.println(joke);
        }
    }
}
