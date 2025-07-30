import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }

        int top = s.pop();

        // recursive call to empty the stack and then add the given value to the bottom of the stack
        pushAtBottom(s, val);

        // to push the remaining elements in the same order as in the original input stack
        s.push(top);
    }
    
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        int val = 4;

        pushAtBottom(s, val);

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
