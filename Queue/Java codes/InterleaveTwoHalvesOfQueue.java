import java.util.*;

public class InterleaveTwoHalvesOfQueue {
    
    public static void interleave(Queue<Integer> q){
        int size = q.size();

        Queue<Integer> q1 = new LinkedList<>();

        for(int i=0; i<size/2; i++){
            q1.add(q.remove());
        }

        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<10; i++){
            q.add(i+1);
        }

        interleave(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
