import java.util.Stack;

public class StackUsingJCF{

    // to implement stack using the Java's internal Collections framework
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(10);
        s.pop();

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}