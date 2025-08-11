import java.util.*;

public class ImplementQueueUsingDeque {
    
    static class Queue{
        static Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        // O(1), O(1)
        public void add(int val){
            dq.addLast(val);
        }

        // O(1), O(1)
        public int remove(){
            return dq.removeFirst();
        }

        // O(1), O(1)
        public int peek(){
            return dq.getFirst();
        }
    } 

    public static void main(String args[]){
        Queue q = new Queue();
        
        q.add(1); // 1
        q.add(3); // 1 3
        q.add(5); // 1 3 5

        q.remove(); // 1

        while(!q.isEmpty()){
            System.out.print(q.remove() + " "); // 3 5
        }
    }
}
