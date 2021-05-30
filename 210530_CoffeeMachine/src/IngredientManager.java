
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

/**
 * 
 */
public class IngredientManager {

    /**
     * Default constructor
     */
    public IngredientManager() {
    }

    /**
     * 
     */
    public static int countPCoffee = 565;
	public static int countNCoffee = 565;
	public static int countSugar = 565;
	public static int countCream = 565;
	public static int countYulmu = 565;
	public static int countBlackTea = 565;
	public static int countCocoa = 565;



    /**
     * @param ingredient
     */
    public static void requestIngredient(List<Object> ingredient) {
        // TODO implement here
    	for (int i = 0; i < ingredient.size(); i++) {
			System.out.println("구성요소는 " + ingredient.get(i) + " 입니다");
			System.out.println(ingredient.get(i) + " 벨브가 열립니다");
			decreaseIngredientCount(ingredient.get(i).toString());
		}
		
		sendIngredient(ingredient);	
    }

    /**
     * @param ingredient
     */
    private static void sendIngredient(List<Object> ingredient) {
        // TODO implement here
    	if (ingredient != null) {
			Manufacture.hasIngredient = true;
		}
    }

    /**
     * @param ingredient
     */
    public void getIngredientCount(String ingredient) {
        // TODO implement here
    }

    /**
     * @param ingredient 
     * @param count
     */
    public void setIngredientCount(String ingredient, int count) {
        // TODO implement here
    }

    /**
     * @param ingredientUsed
     */
    private static void decreaseIngredientCount(String ingredientUsed) {
        // TODO implement here
    	switch (ingredientUsed) {
		case "PCoffee":
			countPCoffee--;
			System.out.println("남은 PCoffee의 분량: " + countPCoffee + "회 분입니다");
			break;

		case "NCoffee":
			countNCoffee--;
			System.out.println("남은 NCoffee의 분량: " + countPCoffee + "회 분입니다");
			break;

		case "Sugar":
			countSugar--;
			System.out.println("남은 Sugar의 분량: " + countPCoffee + "회 분입니다");
			break;

		default:
			break;
		}
    }

}