package basket;

import java.util.ArrayList;
import discount.IDiscount;
import discount.LoyaltyDiscount;

public class Basket {
    private ArrayList<Item> items;
    private ArrayList<IDiscount> discounts;
    private double total;

    public Basket(){
        this.items = new ArrayList<>();
        this.discounts = new ArrayList<>();
        total = 0;
    }


    public int countItems() {
        return this.items.size();
    }

    public void addItem(Item items){
        this.items.add(items);
        this.total += items.getPrice();
    }

    public void removeItem(Item item) {
        this.items.remove(item);
        this.total -= item.getPrice();
    }

    public void emptyItems(){
        this.items = new ArrayList<>();
        this.total = 0;
    }

    public void addDiscount(IDiscount discount){
        this.discounts.add(discount);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void applyDiscount() {
        for (IDiscount discount : discounts) {
            setTotal(discount.applyDiscount(items, total));
        }
    }
}
