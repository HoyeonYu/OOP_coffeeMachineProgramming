
import java.util.*;

/**
 * 
 */
public class MoneyManager {

    /**
     * Default constructor
     */
    public MoneyManager() {
    }

    /**
     * 
     */
    public static int count1000 = 0;

    /**
     * 
     */
    public static int count500 = 600;

    /**
     * 
     */
    public static int count100 = 600;

    /**
     * 
     */
    public static int count50 = 300;

    /**
     * 
     */
    public static int count10 = 300;


    /**
     * 
     */
    public void MoneyManager() {
        // TODO implement here
    }

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

    /**
     * @param input 
     * @param price 
     * @return
     */
    public static int calculateChange(int input, int price) {
        // TODO implement here
        return 0;
    }

    /**
     * @param moneyType
     */
    public void addMoneyCount(String moneyType) {
        // TODO implement here
    }

    /**
     * @param moneyType
     */
    public void minusMoneyCount(String moneyType) {
        // TODO implement here
    }

    /**
     * @param moneyType 
     * @return
     */
    public int getMoneyCount(String moneyType) {
        // TODO implement here
        return 0;
    }

    /**
     * @param moneyType 
     * @param count 
     * @return
     */
    public int setMoneyCount(String moneyType, int count) {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getCoinStackTotal() {
        // TODO implement here
        return 0;
    }

}