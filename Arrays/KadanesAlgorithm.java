package Arrays;

public class KadanesAlgorithm {
    
    // Implementation of Kadane's Algorithm, optimized for special case of all negative elements in the array
    public static int kadane(int arr[]){
        int len = arr.length;
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        boolean flag = true;
        int largest = Integer.MIN_VALUE;

        // Calculate maxSum for mixed or only positive elements array
        for(int i=0;i<len;i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(arr[i]>0 && flag){
                flag = false;
            }
        }

        // In case of all negative elements - maxSum = largest negative element
        if(flag){
            for(int i=0;i<len;i++){
                largest = Math.max(largest, arr[i]);
            }
            return largest;
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};

        System.out.println("Maximum Subarray Sum: " + kadane(arr));

        int arr2[] = {-2,-4,-6,-8,-10};

        System.out.println("Maximum Subarray Sum: " + kadane(arr2));
    }
}
