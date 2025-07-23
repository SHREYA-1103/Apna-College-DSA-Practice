package Arrays;

public class LargestNumber {

    public static int findLargest(int arr[]){
        int len = arr.length;

        int largest = Integer.MIN_VALUE;

        // Iterate over all elements to find the largest
        for(int i=0;i<len;i++){
            largest = Math.max(largest, arr[i]);
        }

        return largest;
    }
    public static void main(String args[]){
        int arr[] = {3, 30, 34, 5, 9};

        System.out.println(findLargest(arr));
    }
}
