public class DetectingCycle {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        // Iterate through the LL using the slow and fast pointers, if they meet, the list has a cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
    
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(5);
        head.next.next = temp;
        temp.next = new Node(4);
        temp.next.next = temp;

        System.out.println(hasCycle(head) ? "The given LL has a cycle" : "The given LL does not have a cycle");
    }
}
