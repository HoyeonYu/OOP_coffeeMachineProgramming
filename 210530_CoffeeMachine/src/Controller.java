
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

/**
 * 
 */
public class Controller {

	/**
	 * Default constructor
	 */
	public Controller() {
	}

	/**
	 * 
	 */
	private static List<Object> ingredient;

	/**
	 * 
	 */
	private int totalInput;

	/**
	 * 
	 */
	private static int productPrice;

	/**
	 * 
	 */
	/*
	 * public UserPanel [占쎈짗占쎌읈 占쎈뮞占쎄문占쎈퓠 占쎈짗占쎌읈占쎌뵠 占쎌뿳占쎌벉] 筌뤿굝議딉옙肉� 占쎈퉸占쎈뼣占쎈┷占쎈뮉 LED甕곌쑵�뱣 占쎌삂占쎈짗 占쎈뻿占쎌깈
	 * 癰귣�沅→묾占� 占쎈짗占쎌읈 獄쏆꼹�넎占쎈릭疫뀐옙;
	 * 
	 * 
	 *//**
		* 
		*/
	/*
	 * public IngredientManager 占쎄텢占쎌뒠占쎈릭�⑨옙 占쎄텚占쏙옙 揶쏆뮇�땾 占쎌젟癰귨옙 癰귣�沅→묾占�;
	 * 
	 * 
	 * 
	 *//**
		* 
		*//*
			 * public CupManager 占쎄텢占쎌뒠占쎈릭�⑨옙 占쎄텚占쏙옙 揶쏆뮇�땾 占쎌젟癰귨옙 癰귣�沅→묾占�;
			 */

	/**
	 * @param source
	 * @return
	 */
	public Boolean checkValidMoney(Object source) {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	public static int getTotalInput() {
		// TODO implement here
		return 0;
	}

	/**
	 * @param totalInput
	 */
	public static void setTotalInput(int totalInput) {
		// TODO implement here
	}

	/**
	 * @param total
	 */
	public static void compareInputPrice(int total) {
		// TODO implement here
	}

	/**
	 * @param newInput
	 */
	public void addCustomerInput(int newInput) {
		// TODO implement here
	}

								
	/**
	 * 
	 */
	public void requestChange() {
		// TODO implement here
	}

	/**
	 * @param selection
	 */
	public static void requestProduct(String selection) {
		// TODO implement here
		compareInputPrice(0);
		
		Thread stepLightThread = new Thread() {
			public void run() {
				try {
					System.out.println("1스텝");
					UserPanel.readyLight1.setText("O");
					Thread.sleep(3000);
					System.out.println(selection + "제품이 선택되었습니다");
					
					CupManager.requestCup();
					System.out.println("-------- 컵 준비 완료");
					
					Thread.sleep(3000);
					int water = WaterManager.requestWater();
					ingredient = DataManager.getIngredient(selection);
					IngredientManager.requestIngredient(ingredient);
					System.out.println("2스텝");
					UserPanel.readyLight2.setText("O");
					System.out.println("-------- 물과 재료 준비 완료");
					
					Thread.sleep(3000);
					Manufacture.mix(water, ingredient);
					UserPanel.readyLight3.setText("O");
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

	/**
	 * 
	 */
	public static void countSetText() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void countUpdate() {
		// TODO implement here
	}

}