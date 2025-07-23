package Arrays;

public class SmallestNumber {

    public static int findSmallest(int arr[]){
        int len = arr.length;

        int smallest = Integer.MAX_VALUE;

        // Iterate through all the elements of the array to find the smallest
        for(int i=0;i<len;i++){
            smallest = Math.min(smallest, arr[i]);
        }

        return smallest;
    }
    
    public static void main(String args[]){
        int arr[] = {3, 5, 1, 8, 2};

        System.out.println("Smallest element in the array: " + findSmallest(arr));
    }
}
