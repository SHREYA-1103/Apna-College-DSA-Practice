public class FindAndRemoveNthNodeFromEnd {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNodeFromEnd(Node head, int n){
        
        //Find size of the linked list
        Node temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        if(n > size || n <= 0){
            System.out.println("Invalid value of n");
            return head;
        }

        if(size == 0){
            System.out.println("Linked list is empty");
            return head;
        }

        // Nth node from end = (size - n + 1)th node from start (1-based indexing)
        int m = size - n;

        // If the head needs to be removed
        if (m == 0) {
            return head.next;
        }

        temp = head;
        int i = 1;
        while (i < m) {
            temp = temp.next;
            i++;
        }

        // Remove the nth node from end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2; // 1-based indexing

        head = removeNodeFromEnd(head, n);
        
        printLL(head);
    }
}
