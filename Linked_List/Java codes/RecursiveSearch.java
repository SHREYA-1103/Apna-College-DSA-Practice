public class RecursiveSearch {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static int findRecursively(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        // Recursively search in the linked list = Linked list excluding the current head node
        int idx = findRecursively(head.next, key);

        return idx == -1 ? -1 : idx + 1;
    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int key = 3;

        int idx = findRecursively(head, key);

        System.out.println(idx == -1 ? "Element not found" : "Element found at index: " + idx);
    }


}
