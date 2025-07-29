public class CheckIfPalindrome {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head){
        // Find mid node
        Node midNode = findMid(head);

        // Reverse the second half of the linked list
        Node prev = null;
        Node curr = midNode;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head; // first half of the linked list (head to midNode-1)
        Node right = prev; // reversed second half of the linked list

        // Check the corresponding elements in the two halfs of the linked list if they match
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head) ? "The given linked list is a palindrome" : "The given linked list is not a palindrome");
    }
}
