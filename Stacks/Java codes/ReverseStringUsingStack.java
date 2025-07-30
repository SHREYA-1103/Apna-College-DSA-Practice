import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();

        int len = str.length();

        // pust all the characters of the string into the stack
        for(int i=0; i<len; i++){
            char c = str.charAt(i);
            s.push(c);
        }

        // to avoid additional consumption of memory due to creation of a new string on every single addition of a new character to it
        StringBuilder res = new StringBuilder();

        // due to stack's LIFO property - we get the elements in the reverse order
        while(!s.isEmpty()){
            res.append(s.pop());
        }

        return res.toString();
    }
    
    public static void main(String args[]){
        String s = "abcd";

        System.out.println("Original string: " + s);

        s = reverseString(s);

        System.out.println("Reversed string: " + s);
    }
}
