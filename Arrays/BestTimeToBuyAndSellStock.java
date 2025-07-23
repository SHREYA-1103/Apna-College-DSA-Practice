package Arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int prices[]){
        int len = prices.length;

        int buyPrice = prices[0];
        int maxProfit = 0;

        // Iterate through all bthe possible selling prices while tracking the min buy price till now and calculate the max possible profit
        for(int i=1; i<len; i++){
            maxProfit = Math.max(prices[i] - buyPrice, maxProfit);
            buyPrice = Math.min(buyPrice, prices[i]);
        }

        return maxProfit;
    }
    
    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum possible profit: " + maxProfit(prices));
    }
}
