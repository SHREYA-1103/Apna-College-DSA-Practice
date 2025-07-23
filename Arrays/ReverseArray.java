package Arrays;

public class ReverseArray {

    public static void reverse(int arr[]){
        int len = arr.length;

        // Iterate through half of the elements and swap them with the elements in the other half of the array - optimized approach
        for(int i=0; i<len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        reverse(arr);

        for(int n: arr) {
            System.out.print(n + " ");
        }
    }
}
