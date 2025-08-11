import java.util.*;

public class QueueUsingStack {
    
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // O(!), O(1)
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // O(n), O(1)
        public void add(int val){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(val);
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        
        // O(1), O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        // O(1), O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();

        q.add(1); // 1
        q.add(2); // 1 2
        q.add(3); // 1 2 3
        q.add(4); // 1 2 3 4
        q.peek(); // 1
        q.remove(); // 2 3 4

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

        System.out.println();
    }
}
