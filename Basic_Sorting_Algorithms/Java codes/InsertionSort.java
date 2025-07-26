public class InsertionSort {

    public static void insertionSort(int arr[]){
        int len = arr.length;

        // Iterate through the array to place each element at its correct position
        for(int i=1; i<len; i++){
            int prev = i-1;
            int curr = arr[i];

            // Shift the elements larger than the current behind it
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev --;
            }

            // Place the current element at correct position
            arr[prev+1] = curr;  
        }          
    }
    
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6};

        insertionSort(arr);
        
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
