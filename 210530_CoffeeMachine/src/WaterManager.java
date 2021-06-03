
import java.util.*;

/**
 * 
 */
public class WaterManager {

    /**
     * Default constructor
     */
    public WaterManager() {
    }

    /**
     * 
     */
    private int AmountWaterStorage = 2000;

    /**
     * 
     */
    private int DropWater = 100;

    /**
     * 
     */
    private Heater heater;

    /**
     * @return
     */
    public int getAmountWaterStorage() { //nu
        // TODO implement here
        return AmountWaterStorage;
    }

    /**
     * @param amountWaterStorage
     */
    public void setAmountWaterStorage(int amountWaterStorage) { //nu
        // TODO implement here
    	AmountWaterStorage = amountWaterStorage;
    }

    /**
     * @param water
     */
    private void sendWater(int water) { //nu
        // TODO implement here
    	System.out.println("send water: "+ water);
    }

    /**
     * @return
     */
    public static int requestWater() { //nu
        // TODO implement here
    	System.out.println("급수중입니다.");
        return 0;
    }

    /**
     * @return
     */
    public int WatercountDecrease() { //nu
        // TODO implement here
    	System.out.println("water count decrease...");
        return 0;
    }

}