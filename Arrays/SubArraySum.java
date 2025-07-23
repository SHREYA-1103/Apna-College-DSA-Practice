package Arrays;

public class SubArraySum {
    
    public static void findSubarraySum(int arr[]){
        int len = arr.length;

        // Iterate through all the possible subarrays and find the sum
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        
        findSubarraySum(arr);
    }
}
