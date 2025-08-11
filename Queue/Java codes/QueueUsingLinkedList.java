
public class QueueUsingLinkedList {
    
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head;
        static Node tail;

        // O(1), O(1)
        public boolean isEmpty(){
            return head == null;
        }
        
        // O(1), O(1)
        public void add(int val){
            Node newNode = new Node(val);

            if(isEmpty()){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // O(1), O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            
            head = head.next;

            return front;
        }

        // O(1), O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
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
