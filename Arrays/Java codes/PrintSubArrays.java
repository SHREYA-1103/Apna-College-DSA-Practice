package Arrays;

public class PrintSubArrays {

    public static void printSubarrays(int arr[]){
        int len = arr.length;

        // Iterate through all the possible subarrays and print their elements
        for(int i=0; i<len; i++) {
            for(int j=i; j<len;j++){
                System.out.print("[");
                for(int k=i; k<j; k++){
                    System.out.print(arr[k] + ", ");
                }
                System.out.print(arr[j]+ "]");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3};
        
        printSubarrays(arr);
    }
}
