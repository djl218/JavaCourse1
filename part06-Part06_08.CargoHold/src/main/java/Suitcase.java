import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
       this.items.add(item);
       
       int totalWeight = 0;
       for (Item item1 : this.items) {
            totalWeight = totalWeight + item1.getWeight();
        }
       
       if (totalWeight > this.maxWeight) {
           this.items.remove(item);
           }
    }
    
    public void printItems() {
        String itemsInSuitcase = "";
        
        for (Item item : this.items) {
            itemsInSuitcase = itemsInSuitcase + item.toString() + "\n";
        }
        
        System.out.println(itemsInSuitcase);
    }     
    
    public int totalWeight () {
        int totalWeight = 0;
        
        for (Item item : this.items) {
            totalWeight = totalWeight + item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem () {
        if (this.items.isEmpty()) {
            return null;
        }
        Item returnObject = this.items.get(0);
        
        for (Item item : this.items) {
            if (returnObject.getWeight() < item.getWeight())
                returnObject = item;
        }
        
        return returnObject;
    }
    
    public String toString() {
        int itemCount = this.items.size();
        int totalWeight = 0;
        
        for (Item item : this.items) {
            totalWeight = totalWeight + item.getWeight();
        }
        
        if (itemCount == 0) {
            return "no items (" + totalWeight + " kg)";
        } else if (itemCount == 1 ) {
            return itemCount + " item (" + totalWeight + " kg)";
        } else {
            return itemCount + " items (" + totalWeight + " kg)"; 
        }        
    }
}
