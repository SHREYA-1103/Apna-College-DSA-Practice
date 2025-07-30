import java.util.Stack;

public class MaxAreaInHistogram {

    public static int findMaxArea(int height[]){
        int len = height.length;

        //Find boundaries - nextSmallerLeft (nsl) and nextSmallerRight (nsr)
        int nsl[] = new int[len];
        int nsr[] = new int[len];

        Stack<Integer> s = new Stack<>();

        nsl[0] = -1; // no next smaller left
        s.push(0);

        // find next smaller left
        for(int i=1; i<len; i++){
            
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // find next smaller right
        s = new Stack<>();
        
        nsr[len-1] = len; //no next smaller right
        s.push(len-1);

        for(int i=len-2; i>=0; i--){

            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = len;
            }
            else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // find current area and compare with max to get the max area
        int max = 0;

        for(int i=0; i<len; i++){
            int currArea = height[i] * (nsr[i] - nsl[i] - 1);
            max = Math.max(max, currArea);
        }

        return max;
    }
    
    public static void main(String args[]){
        int height[] = {2,1,5,6,2,3};

        System.out.print("Max area of the rectangle that can be formed is: " + findMaxArea(height));
    }
}
