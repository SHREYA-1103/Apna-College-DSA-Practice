import java.util.Arrays;

// Variation of 0-1 Knapsack
public class TargetSumSubset {

    public static boolean targetSum_rec(int num[], int target, int n){
        if(target == 0){
            return true;
        }

        if(n == 0){
            return false;
        }

        if(num[n-1] <= target){ // valid item - can be included or excluded
            return targetSum_rec(num, target-num[n-1], n-1) || targetSum_rec(num, target, n-1);
        }

        // invalid item - cannot be included
        return targetSum_rec(num, target, n-1);
    }

    public static int targetSum_memo(int num[], int target, int n, int dp[][]){
        if(target == 0){
            return dp[n][0] = 1;
        }

        if(n == 0){
            return dp[0][target] = 0;
        }

        if(dp[n][target] != -1){
            return dp[n][target];
        }

        if(num[n-1] <= target){ // valid item - can be included or excluded
            return Math.max(targetSum_memo(num, target-num[n-1], n-1, dp), targetSum_memo(num, target, n-1, dp));
        }

        // invalid item - cannot be included
        return targetSum_memo(num, target, n-1, dp);
    }

    public static boolean targetSum_tab(int num[], int target){
        boolean dp[][] = new boolean[num.length+1][target+1];

        for(int i=0; i<num.length+1; i++){
            dp[i][0] = true;
        }

        for(int i=1; i<target+1; i++){
            dp[0][i] = false;
        }

        for(int i=1; i<num.length+1; i++){
            for(int j=1; j<target+1; j++){
                if(num[i-1] <= j){ // valid item - can be included or excluded
                    dp[i][j] = dp[i-1][j-num[i-1]] || dp[i-1][j];
                }
                else{ // invalid item - cannot be included
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[num.length][target];
    }
    
    public static void main(String args[]){
        int num[] = {4,3,2,7,5};
        int target = 10;

        System.out.println(targetSum_rec(num, target, num.length));

        int dp[][] = new int[num.length+1][target+1];
        for(int i=0; i<num.length+1; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(targetSum_memo(num, target, num.length, dp) == 1 ? "true" : "false");

        System.out.println(targetSum_tab(num, target));
    }
}
