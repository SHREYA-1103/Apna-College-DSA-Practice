public class BubbleSort {

    // Implementation of optimized bubble sort - no swaps in a particular iteration -> no need for the next iteration
    public static void bubbleSort(int arr[]) {
        int len = arr.length;

        // Iterate over the array for (n-1) times and keep swapping the adjacent elements
        for(int i=0; i<len-1; i++){
            boolean swap = false;
            for(int j=0; j<len-1; j++){
                if(arr[j+1] < arr[j]){
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    
    public static void main(String args[]){
        int arr[] = {2,5,7,3,5,9};

        bubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
