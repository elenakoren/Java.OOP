package homework01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        HotDrinkMachine vmHotDrink = new HotDrinkMachine();
        List<HotDrink> hotDrinkList = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", 5, 90,42),
                new HotDrink("Tea", 3, 80, 40),
                new HotDrink("Milk",7, 50,40)));
                vmHotDrink.initProduct(hotDrinkList);
            
                String hotDrink = vmHotDrink.getProduct("Tea", 80, 40);
                System.out.println(hotDrink);

                
    }
    
}