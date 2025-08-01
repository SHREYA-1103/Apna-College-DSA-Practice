import java.util.Arrays;

public class Fibonacci {

    // O(2^n), O(1) + recursion stack
    public static int fib_recursion(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fib_recursion(n - 1) + fib_recursion(n - 2);
    }

    // O(n), O(n) + recursion stack
    public static int fib_memo(int n, int dp[]){
        if(n == 0 || n == 1){
            return dp[n] = n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        // recurse but store
        return dp[n] = fib_memo(n-1, dp) + fib_memo(n-2, dp);
    }

    // O(n), O(n)
    public static int fib_tab(int n){
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    
    public static void main(String args[]){
        int n = 10;

        System.out.println("Nth fibonacci number (recursion): " + fib_recursion(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("Nth fibonacci number (DP memoization): " + fib_memo(n, dp));

        System.out.println("Nth fibonacci number (DP tabulation): " + fib_tab(n));
    }
}
