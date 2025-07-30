import java.util.Stack;

public class StockSpanProblem {

    public static void findSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();

        int len = stock.length;

        span[0] = 1; // no next smaller or equal left - only current element
        s.push(0);


        // Find next smaller left using stack to efficiently track the index
        for(int i=0; i<len; i++){
            while(!s.isEmpty() && stock[s.peek()] <= stock[i]){
                s.pop(); // remove all values greater than the current one to find the index of nearest smaller one
            }
            if(s.isEmpty()){
                span[i] = i+1; // all values smaller or equal to the current one
            }
            else{
                span[i] = i - s.peek(); // number of values less than or equal to the current one
            }
            s.push(i);
        }
    }
    
    public static void main(String args[]){
        int stock[] = {100, 80, 60, 70, 85, 100};

        int span[] = new int[stock.length];

        findSpan(stock, span);

        for(int i=0; i<stock.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
