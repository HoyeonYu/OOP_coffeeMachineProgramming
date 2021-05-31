
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

public class IngredientManager {
    public IngredientManager() {
    }

    public static int countPCoffee = 565;
	public static int countNCoffee = 565;
	public static int countSugar = 565;
	public static int countCream = 565;
	public static int countYulmu = 565;
	public static int countBlackTea = 565;
	public static int countCocoa = 565;

    public static void requestIngredient(List<Object> ingredient) {
        // TODO implement here
    	for (int i = 0; i < ingredient.size(); i++) {
			System.out.println("������Ҵ� " + ingredient.get(i) + " �Դϴ�");
			System.out.println(ingredient.get(i) + " ���갡 �����ϴ�");
			decreaseIngredientCount(ingredient.get(i).toString());
		}
		
		sendIngredient(ingredient);	
    }

    private static void sendIngredient(List<Object> ingredient) {
        // TODO implement here
    	if (ingredient != null) {
			Manufacture.hasIngredient = true;
		}
    	else {
			Manufacture.hasIngredient = false;
		}
    }

    public void getIngredientCount(String ingredient) {
        // TODO implement here
    }

    public void setIngredientCount(String ingredient, int count) {
        // TODO implement here
    }

    private static void decreaseIngredientCount(String ingredientUsed) {
    	switch (ingredientUsed) {
		case "PCoffee":
			countPCoffee--;
			System.out.println("���� PCoffee�� �з�: " + countPCoffee + "ȸ ���Դϴ�");
			break;

		case "NCoffee":
			countNCoffee--;
			System.out.println("���� NCoffee�� �з�: " + countNCoffee + "ȸ ���Դϴ�");
			break;

		case "Cream":
			countCream--;
			System.out.println("���� Cream�� �з�: " + countCream + "ȸ ���Դϴ�");
			break;

		case "Sugar":
			countSugar--;
			System.out.println("���� Sugar�� �з�: " + countSugar + "ȸ ���Դϴ�");
			break;

		case "Yulmu":
			countYulmu--;
			System.out.println("���� Yulmu�� �з�: " + countYulmu + "ȸ ���Դϴ�");
			break;

		case "BlackTea":
			countBlackTea--;
			System.out.println("���� BlackTea�� �з�: " + countBlackTea + "ȸ ���Դϴ�");
			break;

		case "Cocoa":
			countCocoa--;
			System.out.println("���� Cocoa�� �з�: " + countCocoa + "ȸ ���Դϴ�");
			break;
			
		default:
			break;
		}
    }

}