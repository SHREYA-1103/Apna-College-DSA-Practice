import java.util.*;

public class DequeUsingJCF {
    
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1); // 1
        dq.addFirst(2); // 2 1
        dq.removeLast(); // 2
        dq.addLast(10); // 2 10

        while(!dq.isEmpty()){
            System.out.print(dq.removeLast() + " "); // 10 2
        }
    }
}
