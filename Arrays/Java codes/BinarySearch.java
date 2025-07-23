package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int len =arr.length;
        int start = 0;
        int end = len-1;

        // find key - O(log n)
        while(start <= end){
            int mid = (start+end)/2;
            
            // key found
            if(arr[mid] == key){
                return mid;
            }
            
            // search in right half of the array
            else if(arr[mid] < key){
                start = mid+1;
            }
            
            // search in left half of the array
            else{
                end = mid-1;
            }
        }

        return -1;
    }
    
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        int key=10;

        int index = binarySearch(arr, key);

        System.out.println( index == -1 ? "Key not found in the array" : "Key found at index: " + index);
    }
}
