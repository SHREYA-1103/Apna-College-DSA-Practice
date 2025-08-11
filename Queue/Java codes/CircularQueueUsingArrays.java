
public class CircularQueueUsingArrays {

    static class CircularQueue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        public CircularQueue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // O(1), O(1)
        public boolean isEmpty(){
            return front == -1;
        }

        // O(1), O(1)
        public boolean isFull(){
            return (rear+1)%size == front;
        }

        // O(1), O(1)
        public void add(int val){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            arr[(rear+1)%size] = val;

            if(front == -1){ // adding first element
                front = 0;
            }

            rear = (rear+1)%size;
        }

        // O(1), O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int res = arr[front];
            
            if(front == rear){ // removing last element
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
                  
            return  res;
        }

        // O(1), O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        cq.add(1); // 1
        cq.add(2); // 1 2
        cq.add(3); // 1 2 3
        cq.remove(); // 2 3
        cq.add(4); // 4 2 3
        cq.add(5); // Queue is full
        System.out.println(cq.peek()); // 2

        while(!cq.isEmpty()){
            System.out.print(cq.remove() + " "); // 2 3 4
        }
        System.out.println();
    }
}
