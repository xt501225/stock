public class StockPrice {
    public static void main(String[] args) {

        StockPrice stock = new StockPrice();

        int[] prices = new int[] {10,7,5,8,11,9};

        int maxProfit =  stock.getMaxProfit(prices);

        System.out.println("maxProfit:" + maxProfit);
    }

    /**
     * get the best profit
     * @param prices  array of stock prices
     * @return maxProfit
     */
    public int getMaxProfit(int[] prices) {

        int maxProfit = 0;   //result

        int buyIdx = 0;  //start from Scratch

        int sellIdx =1;  //start from 1: sell it after buy stock

        //boundary check
        if(prices == null ||prices.length == 0)
        {
            return 0;
        }

        //looping
        for (;sellIdx < prices.length; sellIdx++) {

            if(prices[buyIdx] > prices[sellIdx])   //no profit
            {
                buyIdx = sellIdx;      //buyPointer moves to idx of sellPointer to maximize potential profit
            }
            else
            {
                maxProfit = Math.max(prices[sellIdx] - prices[buyIdx], maxProfit);   // do comparing and get maxProfit
            }

        }

        return maxProfit;

    }
}
