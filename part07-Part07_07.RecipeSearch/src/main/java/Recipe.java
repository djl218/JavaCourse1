import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    //private String[] ingredients;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookTime;
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }
}
