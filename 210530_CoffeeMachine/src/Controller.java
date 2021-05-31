
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

public class Controller {
	public Controller() {
	}

	private static List<Object> ingredient;
	private int totalInput;
	private static int productPrice;

	public Boolean checkValidMoney(Object source) {
		// TODO implement here
		return null;
	}
	
	public static int getTotalInput() {
		// TODO implement here
		return 0;
	}

	public static void setTotalInput(int totalInput) {
		// TODO implement here
	}

	public static void compareInputPrice(int total) {
		// TODO implement here
	}
	
	public void addCustomerInput(int newInput) {
		// TODO implement here
	}

	public void requestChange() {
		// TODO implement here
	}

	public static void requestProduct(String selection) {
		// TODO implement here
		compareInputPrice(0);
		
		Thread stepLightThread = new Thread() {
			public void run() {
				try {
					System.out.println("1스텝");
					Thread.sleep(3000);
					System.out.println(selection + "제품이 선택되었습니다");
					
					CupManager.requestCup();
					System.out.println("-------- 컵 준비 완료");
					
					Thread.sleep(3000);
					int water = WaterManager.requestWater();
					ingredient = DataManager.getIngredient(selection);
					IngredientManager.requestIngredient(ingredient);
					System.out.println("2스텝");
					UserPanel.readyLight2.setText("●");
					System.out.println("-------- 물과 재료 준비 완료");
					
					Thread.sleep(3000);
					Manufacture.mix(water, ingredient);
					UserPanel.readyLight3.setText("●");
					System.out.println("3스텝");
					System.out.println("-------- 제조 완성");
				}
				
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		stepLightThread.start();
		
		Controller.productPrice = DataManager.getPrice(selection);
		int change = MoneyManager.calculateChange(getTotalInput(), Controller.productPrice);
		setTotalInput(change);
		UserPanel.showMoneyLED(getTotalInput());
		compareInputPrice(getTotalInput());
		countSetText();	
	}

	public static void countSetText() {
		// TODO implement here
	}

	public void countUpdate() {
		// TODO implement here
	}

}