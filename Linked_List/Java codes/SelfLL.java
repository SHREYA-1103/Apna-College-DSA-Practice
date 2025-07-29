public class SelfLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static int size = 0;

    // The functions here need not be static as we will be using them only by creating an object of the selfLL class - otherwise static functions are required as only they can be referenced from the static main function
    
    
    // Add node at the beginning of the linked list
    public void addFirst(int val){
        Node newNode = new Node(val);

        if(head != null){
            newNode.next = head;
        }

        head = newNode;

        size++;
    }

    // Add node at the end of the linked list
    public void addLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        size++;
    }

    // Add node at the given index in the linked list (0-based indexing)
    public void add(int index, int val){
        if(index < 0 || index > size){
            System.out.println("Invalid index");
        }
        else if(index == 0){
            addFirst(val);
        }
        else if(index == size){
            addLast(val);
        }
        else{
            Node newNode = new Node(val);
            
            Node temp = head;
            int i = 0;

            while(i < index - 1){
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }
    }

    // Remove the first node in the linked list
    public void removeFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else{
            head = head.next;
            size--;
        }
    }

    // Remove the last node in the linked list
    public void removeLast(){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            Node temp = head;

            while(temp.next.next != null){
                temp = temp.next;
            }

            temp.next = null;
        }
        size--;
    }

    // Print the values of each node in the linked list
    public void printLL(){
        if(head == null){
            System.out.println("Lisked list is empty");
        }
        else{
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        SelfLL ll = new SelfLL();

        ll.addFirst(5); // 5 -> null
        ll.addFirst(10); // 10 -> 5 -> null
        ll.printLL();
        ll.addLast(15); // 10 -> 5 -> 15 -> null
        ll.printLL();
        ll.add(1, 20); // 10 -> 20 -> 5 -> -> 15 -> null
        ll.add(3, 25);  // 10 -> 20 -> 5 -> 25 -> 15 -> null
        ll.printLL();
        ll.removeFirst(); // 20 -> 5 -> 25 -> 15 -> null
        ll.printLL();
        ll.removeLast(); // 20 -> 5 -> 25 -> null
        ll.printLL();
    }
}
