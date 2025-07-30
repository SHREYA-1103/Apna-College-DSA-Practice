import java.util.Stack;

public class DuplicateParentheses {

    // to find is any string of valid parenthese has a duplicate pair
    public static boolean hasDuplicate(String s){
        int len = s.length();

        Stack<Character> stck = new Stack<>();

        for(int i=0; i<len; i++){
            char c = s.charAt(i);

            int count = 0;

            // closing parentheses
            if(c == ')'){
                while(stck.pop() != '('){
                    count++;
                }
                // count of elements between a pair of parentheses - 0 implies no unique character in addition to the last pair - therefore, a duplicate
                if(count < 1){
                    return true;
                }
            }

            else{
                stck.push(c);
            }
        }

        return false;
    }
    
    public static void main(String args[]){
        String s = "((a+b)+(c+d))";
        System.out.println(hasDuplicate(s) ? "The given expression has duplicate parentheses" : "The given expression does not have duplicate parentheses");
    }
}
