public class ReverseDLL {
    
    public static class DLNode{
        int data;
        DLNode next;
        DLNode prev;

        public DLNode(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void printLL(DLNode head){
        DLNode temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static DLNode reverseDLL(DLNode head){
        if(head == null || head.next == null){
            return head;
        }

        DLNode prev = null;
        DLNode curr = head;

        while(curr != null){
            DLNode next = curr.next;
            curr.next = prev;
            curr.prev = next; // additional step as compared to singly LL
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String args[]){
        DLNode head = new DLNode(1);
        head.next = new DLNode(2);
        head.next.prev = head;
        head.next.next = new DLNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DLNode(4);
        head.next.next.next.prev = head.next.next;

        System.out.print("Original DLL: ");
        printLL(head);

        head = reverseDLL(head);

        System.out.print("Reversed DLL: ");
        printLL(head);
    }
}
