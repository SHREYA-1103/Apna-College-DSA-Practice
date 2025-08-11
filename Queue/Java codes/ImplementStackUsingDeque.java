import java.util.*;

public class ImplementStackUsingDeque {
    
    static class Stack{
        static Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        // O(1), O(1)
        public void push(int val){
            dq.addLast(val);
        }

        // O(1), O(1)
        public int pop(){
            return dq.removeLast();
        }

        // O(1), O(1)
        public int peek(){
            return dq.getLast();
        }
    } 

    public static void main(String args[]){
        Stack s = new Stack();
        
        s.push(1); // 1
        s.push(3); // 1 3
        s.push(5); // 1 3 5

        s.pop(); // 5

        while(!s.isEmpty()){
            System.out.print(s.pop() + " "); // 3 1
        }
    }
}
