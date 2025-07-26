import java.util.*;

public class JobSequencing {

    public static int maxProfit(int jobs[][]){
        int len = jobs.length;

        int maxDeadline = 0;

        for(int i=0; i<len; i++){
            maxDeadline = Math.max(maxDeadline, jobs[i][0]);
        }

        // Sort jobs based on profit in descending order
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));

        int maxProfit = 0;
        int deadline[] = new int[maxDeadline+1];

        // Initialize all time slots as empty
        Arrays.fill(deadline, -1);  

        for(int i=0; i<len; i++){
            int idx = jobs[i][0];
            while(idx >=0 && deadline[idx] != -1){
                idx--; 
            }
            if(idx >= 0){
                deadline[idx] = i; // Assign job to this time slot
                maxProfit += jobs[i][1]; // Add profit of this job
            }
        }  

        return maxProfit;
    }
    
    public static void main(String args[]){
        int jobs[][] = {{4, 20}, {1, 10}, {1, 15}, {1, 30}};

        System.out.println("Maximum possible profit that can be earned: " + maxProfit(jobs));
    }
}
