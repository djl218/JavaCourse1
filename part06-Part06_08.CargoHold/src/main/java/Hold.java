import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        this.suitcases.add(suitcase);
        
        int totalWeight = 0;
        for (Suitcase suitcase1 : this.suitcases) {
            totalWeight = totalWeight + suitcase1.totalWeight();
        }
        
        if (totalWeight > this.maxWeight) {
            this.suitcases.remove(suitcase);
        }
    }
    
    public String toString() {
        int suitcaseCount = this.suitcases.size();
        
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        
        return suitcaseCount + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
