import basket.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item1;

    @Before
    public void before(){
        item1 = new Item("Bread", 1.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bread", item1.getName());
    }

    @Test
    public void setName(){
        item1.setName("Half Loaf");
        assertEquals("Half Loaf", item1.getName());
    }
}
