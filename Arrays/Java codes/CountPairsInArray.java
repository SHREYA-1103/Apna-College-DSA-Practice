package Arrays;

public class CountPairsInArray {

    public static int countPairs(int arr[]){
        int len = arr.length;
        int count = 0;

        // Iterate through all possible indices to find the count of possible pairs in the given rray - O(n^2)
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                count++;
            }
        }

        // Calculate the total number of pairs using a formula - O(n)
        // int count1 = (len * (len-1)) / 2;

        return count;
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};

        System.out.println("Total no. of possible pairs in the array: " + countPairs(arr));
    }
}
