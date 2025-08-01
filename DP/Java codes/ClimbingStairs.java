import java.util.Arrays;

// variation of Fibonacci
public class ClimbingStairs{

    public static int findWays_rec(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        // ways to reach nth stair is to climb either 1 stair from (n-1)th stair or 2 stairs from (n-2)th stair
        return findWays_rec(n-1) + findWays_rec(n-2);
    }

    public static int findWays_memo(int n, int dp[]){
        if(n == 0 || n == 1){
            return dp[n] = 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        // ways to reach nth stair is to climb either 1 stair from (n-1)th stair or 2 stairs from (n-2)th stair
        return dp[n] = findWays_memo(n-1, dp) + findWays_memo(n-2, dp);
    }

    public static int findWays_tab(int n){
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n+1; i++){
            // ways to reach nth stair is to climb either 1 stair from (n-1)th stair or 2 stairs from (n-2)th stair
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String args[]){
        int n = 5;

        System.out.println("No. of ways to climb " + n + " stairs (recursion): " + findWays_rec(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("No. of ways to climb " + n + " stairs (DP memo): " + findWays_memo(n, dp));

        System.out.println("No. of ways to climb " + n + " stairs (tabulation): " + findWays_tab(n));
    }
}