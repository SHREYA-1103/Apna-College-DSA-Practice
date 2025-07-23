package Arrays;

public class TrappingRainwater {

    public static int trapWater(int height[]){
        int len = height.length;

        // Track the max left and right boundaries
        int maxLeft[] = new int[len];
        int maxRight[] = new int[len];
        int trap = 0;

        maxLeft[0] = height[0];
        maxRight[len-1] = height[len-1];

        for(int i=1; i<len; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
            maxRight[len-i-1] = Math.max(maxRight[len-i], height[len-i-1]);
        }

        // find the amount of water which can be trapped above each bar
        for(int i=0; i<len; i++){
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trap += waterLevel - height[i];
        }

        return trap;
    }
    
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.println("Maximum trapped rainwater: " + trapWater(height));
    }
}
