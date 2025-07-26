public class CountingSort {

    public static void countingSort(int arr[]){
        int len = arr.length;

        // Find the largest eleemnt in the array to know the range
        int largest = arr[0];

        for(int i=0; i<len; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Construct the freq array to track thecount of all elements in the array
        int freq[] = new int[largest+1];

        for(int i=0; i<len; i++){
            freq[arr[i]]++;
        }

        // Using the freq array, fill the array with sorted elements
        int ind = 0;
        int i = 0;

        while(i <= largest){
            if(freq[i] > 0){
                arr[ind] = i;
                freq[i]--;
                ind++;
            }
            else{
                i++;
            }
        }
    }
    
    public static void main(String args[]){
        int arr [] = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
