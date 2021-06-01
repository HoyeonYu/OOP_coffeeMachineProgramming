
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
/**
 * 
 */
public class TemperatureSensor {

    /**
     * Default constructor
     */
    public TemperatureSensor() {
    }

    /**
     * 
     */
    private int WaterTemperature;


    /**
     * 
     */
    public void run() { //nu
        // TODO implement here
    	System.out.println("Sensor Running...");
    }

    /**
     * @param newTemperature
     */
    public void setWaterTemperature(int newTemperature) { //nu
        // TODO implement here
    	WaterTemperature = newTemperature;
    }

    /**
     * @return
     */
    public static int getWaterTemperature() {
        // TODO implement here
        return 96;
    }

}