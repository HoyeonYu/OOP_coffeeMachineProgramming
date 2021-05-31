
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

public class CupManager {
    public CupManager() {
    }

    public static int CupCount = 350;
    public static int DropCup = 1;

    public static int cupCountDecrease() {
        // TODO implement here
    	CupCount--;
		System.out.println("컵이 하나 사용되었습니다.");
		System.out.println("컵 총 개수는 " + CupCount + "입니다.");
		System.out.println("컵 " + DropCup + "개가 떨어집니다.");
		return CupCount;
    }

    public int getCupCount() {
        // TODO implement here
    	return CupCount;
    }

    public void setCupCount(int newCupCount) {
        // TODO implement here
    	CupManager.CupCount = newCupCount;
    }

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