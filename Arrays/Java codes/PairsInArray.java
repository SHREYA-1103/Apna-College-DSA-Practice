package Arrays;

public class PairsInArray {

    public static void findPairs(int arr[]){
        int len = arr.length;

        // Iterate through all possible pairs and print them
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        
        findPairs(arr);
    }
}
