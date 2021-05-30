
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
			System.out.println("������Ҵ� " + ingredient.get(i) + " �Դϴ�");
			System.out.println(ingredient.get(i) + " ���갡 �����ϴ�");
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
			System.out.println("���� PCoffee�� �з�: " + countPCoffee + "ȸ ���Դϴ�");
			break;

		case "NCoffee":
			countNCoffee--;
			System.out.println("���� NCoffee�� �з�: " + countPCoffee + "ȸ ���Դϴ�");
			break;

		case "Sugar":
			countSugar--;
			System.out.println("���� Sugar�� �з�: " + countPCoffee + "ȸ ���Դϴ�");
			break;

		default:
			break;
		}
    }

}