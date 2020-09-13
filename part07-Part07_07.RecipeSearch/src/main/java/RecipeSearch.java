
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<String> lines = new ArrayList<>();
       Recipes recipes = new Recipes();
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");
        
        try (Scanner reader = new Scanner(Paths.get(file))){ 
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lines.add(line);
                if (line.trim().isEmpty() || (!(reader.hasNextLine()))) {
                    String recipeName = lines.get(0);
                    int cookTime = Integer.valueOf(lines.get(1));
                
                    Recipe recipe = new Recipe(recipeName, cookTime);
                    for (int i = 2; i < lines.size(); i++) {
                        String ingredient = lines.get(i);
                        recipe.addIngredient(ingredient);
                    }
             
                    recipes.addRecipe(recipe);
                    lines.clear();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
                
            if (command.contains("stop")) {
                break;
            } else if (command.contains("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                recipes.list();
            } else if (command.contains("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipes.findName(searchedWord);
            } else if (command.contains("find cooking time")) {
                System.out.print("Max cooking time: ");
                String maxTime = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipes.findCookingTime(Integer.valueOf(maxTime));
            } else if (command.contains("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipes.findIngredient(ingredient);
            } else {
                System.out.println("");
            }
        }
    }       
}
