
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

/**
 * 
 */
public class CupManager {

    /**
     * Default constructor
     */
    public CupManager() {
    }

    /**
     * 
     */
    public static int CupCount = 350;

    /**
     * 
     */
    public int DropCup = 1;


    /**
     * 
     */
	/* public Controller 而� �궗�슜 �떊�샇 蹂대궡湲� 蹂�寃쎈맂 而� 媛쒖닔 ���옣; */

    /**
     * @return
     */
    public static int cupCountDecrease() {
        // TODO implement here
    	CupCount--;
		System.out.println("컵이 하나 사용되었습니다.");
		System.out.println("지금 총 개수는 " + CupCount + "개 입니다");
		return CupCount;	
    }

    /**
     * @return
     */
    public int getCupCount() {
        // TODO implement here
    	return CupCount;
    }

    /**
     * @param newCupCount
     */
    public void setCupCount(int newCupCount) {
        // TODO implement here
    	CupManager.CupCount = newCupCount;
    }

    /**
     * 
     */
    public static void requestCup() {
        // TODO implement here
    	int newCupCount = cupCountDecrease();
		UserPanel.cupCount.setValue(newCupCount);
		UserPanel.Product.setIcon(UserPanel.cup);
		UserPanel.Product.setVisible(true);
		
		if (newCupCount == 0) {
			UserPanel.AlertLED.setText("컵 부족");
		}
    }

}