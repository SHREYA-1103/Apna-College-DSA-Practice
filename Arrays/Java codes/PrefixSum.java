package Arrays;

public class PrefixSum {
    
    // Implementing prefix sum - optimized approach for calculating max subarray sum
    public static int prefixSum(int arr[]){
        int len = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[len];
        prefix[0] = arr[0];

        // Iterate through all indices to find the sum till that index
        for(int i=1; i<len; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Iterate through all possible subarrays using prefix sums and find the maximum sum
        for(int start=0; start<len; start++){
            for(int end=start; end<len; end++){
                maxSum = Math.max(maxSum, prefix[end]-prefix[start]);
            }
        }

        return maxSum;
    }

    public static void main(String args[]){
        int ar[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum subarray sum is: " + prefixSum(ar));
    }
}
