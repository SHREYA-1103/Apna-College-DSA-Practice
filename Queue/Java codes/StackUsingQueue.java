import java.util.*;

public class StackUsingQueue {
    
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // O(1), O(1)
        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // O(1), O(1)
        public void push(int val){
            if(!q1.isEmpty()){
                q1.add(val);
            }
            else{
                q2.add(val);
            }
        }

        // O(n), O(1)
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        return top;
                    }
                    q2.add(top);
                }
            }

            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        return top;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // O(n), O(1);
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }

            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1); // 1
        s.push(3); // 1 3
        s.push(6); // 1 3 6

        System.out.println(s.peek()); // 6

        s.pop(); // 1 3

        while(!s.isEmpty()){
            System.out.print(s.pop() + " "); // 3 1
        }
        System.out.println();

        s.pop(); // Stack is empty
    }
}
