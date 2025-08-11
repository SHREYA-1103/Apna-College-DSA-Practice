
public class QueueUsingArrays {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // O(1), O(1)
        public boolean isEmpty(){
            return rear == -1;
        }

        // O(1), O(1)
        public void add(int val){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            arr[++rear] = val;
        }

        // O(n), O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];

            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }

            rear--;

            return front;
        }

        // O(1), O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(3);

        q.add(1); // 1
        q.add(2); // 1 2
        q.add(3); // 1 2 3
        q.add(4); // Queue is full
        q.peek(); // 1
        q.remove(); // 2 3

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

        System.out.println();
    }
}
