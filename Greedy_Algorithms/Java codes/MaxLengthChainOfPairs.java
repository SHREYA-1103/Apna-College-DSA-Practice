import java.util.*;

public class MaxLengthChainOfPairs {

    public static int maxLength(int pairs[][]){
        int len = pairs.length;

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int curr = 0;
        int count = 0;

        for(int i=0; i<len; i++){
            if(pairs[i][0] > curr){
                curr = pairs[i][1];
                count++;
            }
        }

        return count;
    }
    
    public static void main(String args[]){
        int pairs[][] = {{5, 24}, {15, 25}, {27, 40}, {50, 60}, {70, 80}};

        System.out.println("Maximum length of chain of pairs that can be formed: " + maxLength(pairs));
    }
}
