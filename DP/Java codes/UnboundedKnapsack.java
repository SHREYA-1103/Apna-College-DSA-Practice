import java.util.Arrays;

public class UnboundedKnapsack {

    // O(2^n), O(2^n) recursion stack
    public static int maxProfit_rec(int val[], int wt[], int cap, int n){
        if(n == 0 || cap == 0){
            return 0;
        }

        if(wt[n-1] <= cap){ // valid item - can be included or excluded
            return Math.max(val[n-1] + maxProfit_rec(val, wt, cap-wt[n-1], n), maxProfit_rec(val, wt, cap, n-1));
        }

        // invalid item - cannot be included
        return maxProfit_rec(val, wt, cap, n-1);
    }

    // O(n*cap), O(n*cap) + recursion stack
    public static int maxProfit_memo(int val[], int wt[], int cap, int n, int dp[][]){
        if(n == 0 || cap == 0){
            return dp[n][cap] = 0;
        }

        if(dp[n][cap] != -1){
            return dp[n][cap];
        }

        if(wt[n-1] <= cap){ // valid item - can be included or excluded
            return dp[n][cap] = Math.max(val[n-1] + maxProfit_memo(val, wt, cap-wt[n-1], n, dp), maxProfit_memo(val, wt, cap, n-1, dp));
        }

        else{ // invalid item - cannot be included
            return dp[n][cap] = maxProfit_memo(val, wt, cap, n-1, dp);
        }
    }

    // O(n*cap), O(n*cap)
    public static int maxProfit_tab(int val[], int wt[], int cap){
        int n = val.length;
        
        int dp[][] = new int[n+1][cap+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }

        for(int i=0; i<cap+1; i++){
            dp[0][i] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<cap+1; j++){
                if(wt[i-1] <= j){ // valid item - can be included or excluded
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                }
                else{ // invalid item - cannot be included
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][cap];
    }
    
    public static void main(String args[]){
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int cap = 7;

        int n = val.length;

        System.out.println("Max profit (recursion): " + maxProfit_rec(val, wt, cap, n));

        int dp[][] = new int[n+1][cap+1];
        for(int i=0; i<n+1; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println("Max profit (DP memoization): " + maxProfit_memo(val, wt, cap, n, dp));

        System.out.println("Max profit (DP tabulation): " + maxProfit_tab(val, wt, cap));
    }
}
