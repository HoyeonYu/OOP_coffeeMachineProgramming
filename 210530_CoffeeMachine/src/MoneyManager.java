
import java.util.*;

public class MoneyManager {
    public MoneyManager() {
    	
    }

    public static int count1000 = 0;
    public static int count500 = 600;
    public static int count100 = 600;
    public static int count50 = 300;
    public static int count10 = 300;

    /**
     * @param oldInput 
     * @param newInput 
     * @return
     */
    public static int calculateTotalInput(int oldInput, int newInput) {
        // TODO implement here
    	
    	oldInput+=newInput;
    	
        return oldInput;
    }

    public static int calculateChange(int input, int price) {
        // TODO implement here
    	input-=price;
        return input;
    }
    
    public void addMoneyCount(String moneyType) {
        // TODO implement here
    }
    
    public void minusMoneyCount(String moneyType) {
        // TODO implement here
    }

    public static int getMoneyCount(String moneyType) {
    	if (moneyType == "1000") {
    		return count1000;
    	}

    	if (moneyType == "500") {
    		return count500;
    	}

    	if (moneyType == "100") {
    		return count100;
    	}

    	if (moneyType == "50") {
    		return count50;
    	}

    	if (moneyType == "10") {
    		return count10;
    	}

        return 0;
    }

    public int setMoneyCount(String moneyType, int count) {
        return 0;
    }

    public static int getCoinStackTotal() {
    	return (count1000 + count500 + count100 + count50 + count10);
    }
    
    public static int getCurrentBalanceTotal() {
    	return (count1000*1000 + count500*500 + count100*100 + count50*50 + count10*10);
    }
    
    public static boolean notEnoughChange() {
    	System.out.println("Current Input: " + UserPanel.currentInput);
    	
    	if ((UserPanel.currentInput / 1000 > 0 && UserPanel.currentInput / 1000 <= count1000) ||
    		(UserPanel.currentInput / 500 > 0 && UserPanel.currentInput / 500 <= count500) ||
    		(UserPanel.currentInput / 100 > 0 && UserPanel.currentInput / 100 <= count100) ||
    		(UserPanel.currentInput / 50 > 0 && UserPanel.currentInput / 50 <= count50) ||
    		(UserPanel.currentInput / 10 > 0 && UserPanel.currentInput / 10 <= count10 )) {    		
    		return false;
    	}

    	return true;
    }

}