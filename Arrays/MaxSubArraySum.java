package Arrays;

public class MaxSubArraySum {
    
    public static int maxSubarraySum(int arr[]){
        int len = arr.length;
        int maxSum = Integer.MIN_VALUE;

        // Iterate through all possible subarrays and find their sum to calculate maxSum
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                int sum = 0;
                for(int k=i; k<j; k++){
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String args[]){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
