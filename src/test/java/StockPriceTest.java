import junit.framework.TestCase;
import org.junit.Test;

public class StockPriceTest extends TestCase {

    StockPrice stock;
    int[] prices ;
    public void setUp() throws Exception {
        super.setUp();
        stock = new StockPrice();
    }

    @Test
    public void testGetMaxProfit() throws Exception {

        assertEquals(0, stock.getMaxProfit(prices));

        prices = new int[]{};
        assertEquals(0, stock.getMaxProfit(prices));

        prices = new int[] {10,7,5,8,11,9};
        assertEquals(6,stock.getMaxProfit(prices));

        prices= new int[]{1,2,3,4,5};
        assertEquals(4, stock.getMaxProfit(prices));

        prices= new int[]{2,1,0,1,2,3};
        assertEquals(3, stock.getMaxProfit(prices));

        prices= new int[]{5,4,3,2,1};
        assertEquals(0, stock.getMaxProfit(prices));

    }


}