package Arrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int key) {
        int len = arr.length;

        int index = -1;

        // Iterate through all elements to find the index of the desired key
        for(int i=0;i<len;i++){
            if(arr[i] == key){
                return i;
            }
        }

        return index;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 3;

        int index = linearSearch(arr, key);

        System.out.println(index == -1 ? "Element not found in the array" : "Element found at index: " + index);
    }
}