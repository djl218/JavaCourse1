public class Bird {
    private String englishName;
    private String latinName;
    private int observations;
    
    public Bird() {
        this.englishName = englishName;
        this.latinName = latinName;
        this.observations = observations;
    }
    
    public String getEnglishName() {
        return this.englishName;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservations() {
        return this.observations;
    }
    
    public void addObservation() {
        this.observations = this.observations + 1;
    }
    
    public void addBird(String englishName, String latinName) {
        this.englishName = englishName;
        this.latinName = latinName;
    }
        
    public String toString() {
        return this.getEnglishName() + " (" + this.getLatinName() + "): " + this.getObservations() + " observations";
    }
    
}
