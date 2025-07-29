public class ZigZagLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next; // To get mid as the last node of the first half

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node formZigZag(Node head){
        // find mid - last node of first half
        Node midNode = findMid(head);

        // separate first and secind half of the list
        Node right = midNode.next; // 2nd half
        midNode.next = null;
        Node left = head; // 1st half

        // reverse the second or the right half
        Node prev = null;
        Node curr = right;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        right = prev; // head of the reversed second half LL

        // alternatively merge the nodes from the first and the second half
        Node temp1 = new Node(-1);
        Node temp = temp1;

        while(left != null && right != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;

            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        // in case of odd number of nodes in the LL
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
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
    
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original LL: ");
        printLL(head);

        head = formZigZag(head);

        System.out.print("Zig Zag LL: ");
        printLL(head);
    }
}
