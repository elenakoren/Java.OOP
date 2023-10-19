package homework01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    List<HotDrink> hotDrinkList = new ArrayList<>();
    List<HotDrink> resultFind = new ArrayList<>();

    
    
    @Override
    public void initProduct(List<HotDrink> list) {
        this.hotDrinkList = list;
       
    }
    
    public String getProduct(String name, double volume, int temp) {
        HotDrink hotDrink = new HotDrink();
        for (HotDrink el : hotDrinkList) {
            if (el.getName().equals(name) && el.getVolume() == volume && el.getTemp() == temp){
                hotDrink = el;
            }
            
        }

        return hotDrink.toString();
    }
}