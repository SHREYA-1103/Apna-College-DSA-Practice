public class IterativeSearch {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static int findIteratively(Node head, int key){
        if(head == null){
            System.out.println("Linked list is empty");
            return -1;
        }

        Node temp = head;
        int idx = 0;

        // Iterate through the linked list to find if the given key exists - similar to linear search
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return idx;
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int key = 3;

        int idx = findIteratively(head, key);

        System.out.println(idx == -1? "Element not found in the linked list" : "Element found at index: " + idx);
    }
}
