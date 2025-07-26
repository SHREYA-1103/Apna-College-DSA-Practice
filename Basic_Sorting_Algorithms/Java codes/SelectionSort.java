public class SelectionSort {

    public static void selectionSort(int arr[]){
        int len = arr.length;

        // Iterate over the array for (n-1) times to find the smallest number in the unsorted array and place at the end of the sorted array
        for(int i=0;  i<len-1; i++){
            int minPos = i;
            
            // Find the smallest number in the unsorted array (i+1 to n)
            for(int j=i+1; j<len; j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }

            // Place at the end of the sorted array (i)
            if(minPos != i){
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
    }
   
    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};

        selectionSort(arr);
        
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
