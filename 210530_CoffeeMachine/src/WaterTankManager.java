
import java.util.*;

/**
 * 
 */
public class WaterTankManager {

    /**
     * Default constructor
     */
    public WaterTankManager() {
    }

    /**
     * 
     */
    private int waterTankA = 17000;

    /**
     * 
     */
    private int waterTankB = 17000;


    /**
     * @param waterNeeded
     */
    public void requestWaterTank(int waterNeeded) { //nu
        // TODO implement here
    	System.out.println("requestWaterTank: "+waterNeeded);
    }

    /**
     * @param waterNeeded 
     * @return
     */
    public int sendWater_fromA(int waterNeeded) { //nu
        // TODO implement here
    	System.out.println("sendWater_fromA: "+waterNeeded);
        return 0;
    }

    /**
     * @param waterNeeded 
     * @return
     */
    public int sendWater_fromB(int waterNeeded) { //nu
        // TODO implement here
    	System.out.println("sendWater_fromB: "+waterNeeded);
        return 0;
    }

    /**
     * @param Tank 
     * @param tankWaterNeeded
     */
    public void provideNewWater(String Tank, int tankWaterNeeded) { //nu
        // TODO implement here
    	System.out.println("Tank "+Tank+" provideNewWater "+tankWaterNeeded);
    }

}