import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, val);

        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();

        // recursive call to empty the stack
        reverse(s);

        // pushing the elements at the bottom help put them in the rebverse order - therefore reversing the stack
        pushAtBottom(s, top);
    }
    
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
