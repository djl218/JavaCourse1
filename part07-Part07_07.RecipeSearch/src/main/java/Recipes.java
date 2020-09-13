import java.util.ArrayList;

public class Recipes {
    private ArrayList<Recipe> recipes;
    
    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void list() {
        String recipes = "";
        
        for (Recipe recipe : this.recipes) {
            recipes = recipes + recipe.toString() + "\n";
        }
        
        System.out.println(recipes);
    }
    
    public void findName(String searchedWord) {
        String recipesWithWord = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.toString().contains(searchedWord)) {
                recipesWithWord = recipesWithWord + recipe.toString() + "\n";
            }
        }
        System.out.println(recipesWithWord);;
    }
    
    public void findCookingTime(int maxTime){
        String recipesLessThanMaxTime = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                recipesLessThanMaxTime = recipesLessThanMaxTime + recipe.toString() + "\n";
            }
        }
        System.out.println(recipesLessThanMaxTime);
    }
    
    public void findIngredient(String searchedIngredient) {
        String recipesWithIngredient = "";
        for (Recipe recipe : this.recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String ingredient : ingredients) {
                if (ingredient.equals(searchedIngredient)) {
                    recipesWithIngredient = recipesWithIngredient + recipe.toString() + "\n";
                }
            }
        }
        System.out.println(recipesWithIngredient);
    }
}
