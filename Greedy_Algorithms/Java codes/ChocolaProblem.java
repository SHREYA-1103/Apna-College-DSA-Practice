import java.util.*;

public class ChocolaProblem {

    public static int minCost(int horz[], int vert[]){
        int m = horz.length;
        int n = vert.length;

        // Sort both the arrays so as to pick the highest price first
        Arrays.sort(horz);
        Arrays.sort(vert);

        int h = m-1 , v = n-1;
        int hp = 1, vp = 1;
        int minCost = 0;

        // Cut the chocolate ointo pieces one by one, moving from highest price cut to the lowest one
        while(h>=0 && v>=0){
            if(horz[h] >= vert[v]){
                minCost += (horz[h] * vp);
                hp++;
                h--;
            }
            else{
                minCost += (vert[v] * hp);
                vp++;
                v--;
            }
        }

        // Make the remainign hprizontal cuts, if any
        while(h >= 0){
            minCost += (horz[h] * vp);
            hp++;
            h--;
        }

        // Make the remainign vertical cuts, if any
        while(v >= 0){
            minCost += (vert[v] * hp);
            vp++;
            v--;
        }

        return minCost;
    }
    
    public static void main(String args[]){
        int horz[] = {2, 1, 3, 1, 4};
        int vert[] = {4,1,2};

        System.out.println(minCost(horz, vert));
    }
}
