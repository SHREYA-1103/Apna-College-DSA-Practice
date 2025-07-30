import java.util.ArrayList;

public class StackUsingArrayList {
    
    // Custom stack class - implemented using arraylist as a stack
    static class Stack{
        public static ArrayList<Integer> list = new ArrayList<>();

        // to add an element at the top of the stack or the last of the arraylist - O(1)
        public void push(int data){
            list.add(data);
        }

        // to remove an element from the top of the stack or the last of the arraylist - O(1)
        public int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // to view the value stored at the top of the stack or the last of the arraylist - O(1)
        public int peek(){
            int top = list.get(list.size() - 1);
            return top;
        }

        // to check if the stack or the arraylist is empty - O(1)
        public boolean isEmpty(){
            return list.isEmpty();
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(10);
        s.pop();

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
