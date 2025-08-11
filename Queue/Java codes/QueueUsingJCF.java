import java.util.*;

public class QueueUsingJCF {
    
    // O(1), O(1) - All operations
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

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
