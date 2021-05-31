
import java.util.*;

public class DataManager {
    public DataManager() {
    	
    }

    private int productPrice;
    private static List<Object> ingredient = new ArrayList<>();

    public static int getPrice(String selection) {
        // TODO implement here
        return 0;
    }
    
    public void setPrice(String selection, int price) {
        // TODO implement here
    }

    public static List<Object> getIngredient(String selectMenu) {
    	switch (selectMenu) {
		case "PBlackCoffee":
			ingredient.add("PCoffee");
			return ingredient;

		case "PSugarCoffee":
			ingredient.add("PCoffee");
			ingredient.add("Sugar");
			return ingredient;

		case "PSugarCreamCoffee":
			ingredient.add("PCoffee");
			ingredient.add("Sugar");
			ingredient.add("Cream");
			return ingredient;

		case "NBlackCoffee":
			ingredient.add("NCoffee");
			return ingredient;

		case "NSugarCoffee":
			ingredient.add("NCoffee");
			ingredient.add("Sugar");
			return ingredient;

		case "NSugarCreamCoffee":
			ingredient.add("NCoffee");
			ingredient.add("Sugar");
			ingredient.add("Cream");
			return ingredient;
			
		case "Yulmu":
			ingredient.add("Yulmu");
			return ingredient;

		case "BlackTea":
			ingredient.add("BlackTea");
			return ingredient;
			
		case "Cocoa":
			ingredient.add("Cocoa");
			return ingredient;

		default:
			break;
		}

        return null;
    }

}