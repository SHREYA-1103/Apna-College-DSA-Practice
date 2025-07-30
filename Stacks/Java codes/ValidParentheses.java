import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        int len = str.length();

        // Iterate through the string to find if each character adds to validity of the string
        for(int i=0; i<len; i++){
            char c = str.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                s.push(c); // add to stack so that we can match when their corresponding closing parenthese arrive in the string
            }

            else if((c == ')' && s.peek() == '(') || (c == ']' && s.peek() == '[') || (c == '}' && s.peek() == '{')){
                s.pop(); // remove from stack if the complete pair is formed - track the next
            }

            else{
                return false;
            }
        }

        return true;
    }
   
    public static void main(String args[]){
        String s = "[]{([]}";

        System.out.println(isValid(s));
    }
}
