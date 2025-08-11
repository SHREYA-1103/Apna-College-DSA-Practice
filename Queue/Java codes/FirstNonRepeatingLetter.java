import java.util.*;

public class FirstNonRepeatingLetter {
    
    public static void findFNRL(String s){
        Queue<Character> q =  new LinkedList<>();
        
        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq[c-'a']++;
            q.add(c);

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1" + " ");
            }
            else{
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String args[]){
        String s = "aabccxb";

        findFNRL(s);
    }
}
