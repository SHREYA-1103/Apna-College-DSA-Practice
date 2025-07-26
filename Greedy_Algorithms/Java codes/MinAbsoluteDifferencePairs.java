import java.util.*;

public class MinAbsoluteDifferencePairs {

    public static int minDiff(int arr1[], int arr2[]){
        int len = arr1.length;

        // Sort bot the arrays in ascending order
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = 0;
        
        // Iterate through the sorted arrays, pairing each corresponding element - smaller ones paired with smaller and larger ones with the larger gives the min absolute diff 
        for(int i=0; i<len; i++){
            minDiff += Math.abs(arr1[i] - arr2[i]);
        }

        return minDiff;
    }
    
    public static void main(String args[]){
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {4, 5, 6, 7};

        System.out.println("Sum of Min Absolute Diff of Pairs: " + minDiff(arr1, arr2));
    }
}
