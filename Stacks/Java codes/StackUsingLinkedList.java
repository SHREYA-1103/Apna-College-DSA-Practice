
public class StackUsingLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Custom stack class - implemented using custom linked list as a stack
    static class Stack{
        static Node head = null;

        // to add an element at the top of the stack or as the first node (head) of the linked list - O(1)
        public void push(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }

        // to remoeve an element from the top of the stack or rhe head node of the linked list - O(1)
        public int pop(){
            int top = head.data;

            head = head.next;

            return top;
        }

        // to view the value at the top of the stack or the value stored in the head node of the linked list - O(1)
        public int peek(){
            return head.data;
        }

        // to check if the stack is empty or the head node of the linked list is a null node
        public boolean isEmpty(){
            return head == null;
        }
    }
    
    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(10);
        s.pop();

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
