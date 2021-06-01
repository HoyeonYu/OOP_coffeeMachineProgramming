
import java.util.*;

public class DataManager {
    public DataManager() {
    	
    }

    private int productPrice;
    private static List<Object> ingredient = new ArrayList<>();

    public static int getPrice(String selection) { //nu
        // TODO implement here
    	switch (selection) {
		case "PBlackCoffee":
			return 400;

		case "PSugarCoffee":
			return 400;

		case "PSugarCreamCoffee":
			return 400;

		case "NBlackCoffee":
			return 300;

		case "NSugarCoffee":
			return 300;

		case "NSugarCreamCoffee":
			return 300;
			
		case "Yulmu":
			return 300;

		case "BlackTea":
			return 300;
			
		case "Cocoa":
			return 300;

		default:
			return 0;
		}

    }
    
    public void setPrice(String selection, int price) { //nu
        // TODO implement here
    	switch (selection) {
		case "PBlackCoffee":
			price = 400;
			break;

		case "PSugarCoffee":
			price = 400;
			break;

		case "PSugarCreamCoffee":
			price = 400;
			break;

		case "NBlackCoffee":
			price = 300;
			break;

		case "NSugarCoffee":
			price = 300;
			break;

		case "NSugarCreamCoffee":
			price = 300;
			break;
			
		case "Yulmu":
			price = 300;
			break;
			
		case "BlackTea":
			price = 300;
			break;
			
		case "Cocoa":
			price = 300;
			break;

		default:
			break;
		}
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