package homework01;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    
    void initProduct(List<HotDrink> list);

    String getProduct(String name, double volume);

    
}
