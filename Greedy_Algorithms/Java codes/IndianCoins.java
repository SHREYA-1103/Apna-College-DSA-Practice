import java.util.*;

public class IndianCoins {

    public static int minCoins(int coins[], int amount){
        int len = coins.length;

        // Sort all the coins in ascending order to use the largest ones first
        Arrays.sort(coins);

        int idx = len-1;
        int minCoins = 0;

        // Pick the largest possible denomination coin so as to cover the most amount but include less number of coins
        while(idx >= 0 && amount > 0){
            if(coins[idx] <= amount){
                minCoins++;
                amount -= coins[idx];
            }
            else{
                idx--;
            }
        }

        return minCoins;
    }
    
    public static void main(String args[]){
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500};
        int amount = 1021;

        System.out.println("Min coins needed for Rs. " + amount + " is: " + minCoins(coins, amount));

    }
}
