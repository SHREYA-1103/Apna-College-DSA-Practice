import java.util.*;

public class ActivitySelection {

    public static int maxActivities(int start[], int end[]){
        int len = start.length;

        int activities[][] = new int[len][3];

        // Create a combined array of activities with their index, start time and end time
        for(int i=0; i<len; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sort the activities based on their end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int count = 0;
        int currTime = 0;
        int idx = 0;

        // Iterate through all the activities and check if they can be performed after the last one 
        while(idx < len){
            if(activities[idx][1] >= currTime){
                count++;
                currTime = activities[idx][2];
            }
            idx++;
        }

        return count;
    }
    
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        System.out.println("Maximum activities which can be performed: " + maxActivities(start, end));
    }
}
