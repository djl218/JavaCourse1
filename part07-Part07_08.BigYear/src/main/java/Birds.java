import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;
    
    public Birds() {
        this.birds = new ArrayList<>();
    }
    
    public void addBirdToBirds(Bird bird) {
        this.birds.add(bird);
    }
    
    public void observation(String enteredEnglishName) {
        for (Bird bird : this.birds) {
            if (bird.getEnglishName().equals(enteredEnglishName)) {
                bird.addObservation();
            } 
        }
        
        String birdCheck = "";
        for (Bird bird : this.birds) {
            if (bird.getEnglishName().equals(enteredEnglishName)) {
                birdCheck = birdCheck + bird.toString();
            }
        }
        
        if (birdCheck.isEmpty()) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printBird(String enteredEnglishName) {
        String printedBird = "";
        for (Bird bird : this.birds) {
            if (bird.getEnglishName().equals(enteredEnglishName)) {
                printedBird = printedBird + bird.toString();
            }
        }
        
        System.out.println(printedBird);
    }
    
    public void printBirds() {
        String printedBirds = "";
        for (Bird bird : this.birds) {
            printedBirds = printedBirds + bird.toString() + "\n";
        }
        
        System.out.print(printedBirds);
    }
}
