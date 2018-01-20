package discount;
import basket.Item;
import java.util.ArrayList;



public class LoyaltyDiscount implements IDiscount {

    @Override
    public double applyDiscount(ArrayList<Item> items, double total) {
        return total * 0.98;
    }
}
