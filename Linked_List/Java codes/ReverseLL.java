public class ReverseLL {
    
    public static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    static Node head = null;

    // Reverse the linked list by updating links - without using any extra space
    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev= null;
        Node curr = head;

        // Iterate through the linked list to update the pointers, delete the link to the next and add a link to the prev node
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void printLL(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String args[]){
        ReverseLL ll = new ReverseLL();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        ll.printLL();

        head = ll.reverse(head);

        System.out.println("Reversed List:");
        ll.printLL();
    }
}
