public class RemovingCycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeCycle(Node head){
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        // Iterate through the LL using the slow and fast pointers to track if the list has a cycle - only then we should try to remove it
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            System.out.println("The given LL does not have a cycle");
            return head;
        }

        slow = head;
        Node prev = null; // To track the last node of the cycle whose next when pointed to null, removes the cycle from the list

        // Iterate through the list again, moving both slow and fast by 1 to find the start of the cycle, the point where they will meet again
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;

        return head;

    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(5);
        head.next.next = temp;
        temp.next = new Node(4);
        temp.next.next = temp;
        
        head = removeCycle(head);

        printLL(head);
    }
}
