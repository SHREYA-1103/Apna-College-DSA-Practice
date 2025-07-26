import java.util.*;

public class FractionalKnapsack {

    public static int maxProfit(int val[], int wt[], int cap){
        int len = val.length;

        int items[][] = new int[len][4];

        for(int i=0; i<len; i++){
            items[i][0] = i;
            items[i][1] = val[i];
            items[i][2] = wt[i];
            items[i][3] = val[i]/wt[i];
        }

        // Sort items in the ascending order of their value/weight ratio
        Arrays.sort(items, Comparator.comparingDouble(o -> o[3]));

        int maxProfit = 0; 
        
        // Iterate throught the sorted items in reverse order and include them in the knapsack and update the profit, until the capacity is exhausted
        for(int i=0; i<len; i++){
            
            // Include the entire item
            if(items[len-i-1][2] <= cap){
                cap -= items[len-i-1][2];
                maxProfit += items[len-i-1][1];
            }
            
            // Include fraction of the item
            else {
                maxProfit += items[len-i-1][3] * cap;
                break;
            }
        }

        return maxProfit;
    }

    public static void main(String args[]){
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int capacity = 50;

        System.out.println(maxProfit(value, weight, capacity));
    }
}