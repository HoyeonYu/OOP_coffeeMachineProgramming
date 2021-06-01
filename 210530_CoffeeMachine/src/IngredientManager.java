
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
			System.out.println("구성요소는 " + ingredient.get(i) + " 입니다");
			System.out.println(ingredient.get(i) + " 벨브가 열립니다");
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

    public int getIngredientCount(String ingredient) { //nu
        // TODO implement here
    	switch (ingredient) {
		case "countPCoffee":
			return countPCoffee;

		case "countNCoffee":
			return countNCoffee;
			
		case "countSugar":
			return countSugar;

		case "countCream":
			return countCream;

		case "countYulmu":
			return countYulmu;
			
		case "countBlackTea":
			return countBlackTea;
			
		case "countCocoa":
			return countCocoa;
			
		default:
			return 0;
		}

    }

    public void setIngredientCount(String ingredient, int count) {  //nu
        // TODO implement here
    	switch (ingredient) {
		case "PCoffee":
			countPCoffee = count;
			break;

		case "NCoffee":
			countNCoffee = count;
			break;

		case "Sugar":
			countSugar = count;
			break;

		case "Cream":
			countCream = count;
			break;

		case "Yulmu":
			countYulmu = count;
			break;

		case "BlackTea":
			countBlackTea = count;
			break;
			
		case "Cocoa":
			countCocoa = count;
			break;
			
		default:
			break;
		}
    }

    private static void decreaseIngredientCount(String ingredientUsed) {
    	switch (ingredientUsed) {
		case "PCoffee":
			countPCoffee--;
			System.out.println("남은 PCoffee의 분량: " + countPCoffee + "회 분입니다");
			break;

		case "NCoffee":
			countNCoffee--;
			System.out.println("남은 NCoffee의 분량: " + countNCoffee + "회 분입니다");
			break;

		case "Cream":
			countCream--;
			System.out.println("남은 Cream의 분량: " + countCream + "회 분입니다");
			break;

		case "Sugar":
			countSugar--;
			System.out.println("남은 Sugar의 분량: " + countSugar + "회 분입니다");
			break;

		case "Yulmu":
			countYulmu--;
			System.out.println("남은 Yulmu의 분량: " + countYulmu + "회 분입니다");
			break;

		case "BlackTea":
			countBlackTea--;
			System.out.println("남은 BlackTea의 분량: " + countBlackTea + "회 분입니다");
			break;

		case "Cocoa":
			countCocoa--;
			System.out.println("남은 Cocoa의 분량: " + countCocoa + "회 분입니다");
			break;
			
		default:
			break;
		}
    }

}