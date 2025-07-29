public class MergeSortLL {
    public static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next; // different initialization to ensure tha tht emidNode is the last node of the first half

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node mergeSortLL(Node head){
        //base cases
        if(head == null || head.next == null){
            return head;
        }
        
        // Find mid node 
        Node midNode = findMid(head);

        // Separate LL into left and right halfs
        Node right = midNode.next;
        midNode.next = null;
        Node left = head;
    
        // merge sort both left and right
        left = mergeSortLL(left);
        right = mergeSortLL(right);

        // merge left and right
        Node temp1 = new Node(-1);
        Node temp = temp1;

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        while(left != null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while(right != null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }

        return temp1.next;
    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String arg[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(3);

        System.out.print("Original LL: ");
        printLL(head);
        
        head = mergeSortLL(head);

        System.out.print("Sorted LL: ");
        printLL(head);
    }
}
