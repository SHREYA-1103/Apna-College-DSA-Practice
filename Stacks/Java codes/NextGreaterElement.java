import java.util.Stack;

public class NextGreaterElement {

    public static void findNextGreater(int arr[], int ngr[]){
        Stack<Integer> s = new Stack<>();

        int len = arr.length;
        
        ngr[len - 1] = -1; // no element on the right
        s.push(len-1);

        // Iterate to find the next greater element for each element of the array
        for(int i=len-2; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop(); // remove all smaller elements
            }
            if(s.isEmpty()){
                ngr[i] = -1; // no element greater than the current on the right
            }
            else{
                ngr[i] = arr[s.peek()]; // value fo the next greater element on the right
            }
            s.push(i);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {6,8,0,2,1,3};

        int ngr[] = new int[arr.length];
        
        findNextGreater(arr, ngr);

        for(int i=0; i<arr.length; i++){
            System.out.print(ngr[i] + " ");
        }
    }
}
