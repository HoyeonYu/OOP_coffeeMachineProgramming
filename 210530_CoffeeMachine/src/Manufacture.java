
import java.util.*;

public class Manufacture {
	
	public static boolean hasIngredient = true;

    /**
     * Default constructor
     */
    public Manufacture() {
    }




    /**
     * @param water 
     * @param ingredient 
     * @return
     */
    public static Boolean mix(int water, List<Object> ingredient) { //nu
        // TODO implement here

    	System.out.println("�Ʒ� ��Ḧ �����ϴ�.");
    	
    	for (int i = 0; i < ingredient.size(); i++) {
			System.out.print(ingredient.get(i) + " ");
		}

    	System.out.println();
    	
        return true;
    }

}