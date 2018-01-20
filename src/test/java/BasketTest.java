import basket.Basket;
import basket.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;
    Item item1;
    Item item2;


    @Before
    public void before(){
        basket = new Basket();
        item1 = new Item("Apple", 1.00);
        item2 = new Item("Orange", 1.00);
        basket.addItem(item1);
        basket.addItem(item2);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(2, basket.countItems());

    }

    @Test
    public void addItemsToBasket(){
        basket.addItem(item1);
        assertEquals(3, basket.countItems());

    }

    @Test
    public void removeItem(){
        assertEquals(2, basket.countItems());
        basket.removeItem(item1);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void canEmptyItems(){
        assertEquals(2, basket.countItems());
        basket.emptyItems();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canGetTotal(){
        assertEquals(2.00, basket.getTotal(), 0.1);
    }
}
