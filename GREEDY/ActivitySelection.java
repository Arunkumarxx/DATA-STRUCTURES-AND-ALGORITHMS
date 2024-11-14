package GREEDY;

import java.util.*;
public class ActivitySelection {
    public int activitySelection(List<Integer> start, List<Integer> end) {
        int n1=start.size();
        int[][] PairArray=new int[n1][2];
        for(int i=0;i<n1;++i)
        {
            PairArray[i][0] = start.get(i);
            PairArray[i][1] = end.get(i);
        }
        Arrays.sort(PairArray, Comparator.comparingInt(o->o[1]));
        int n=PairArray.length;
        int c=1;
        int prev=PairArray[0][1];
        for(int i=1;i<n;++i) {
            if(PairArray[i][0]>prev) {
                c++;
                prev=PairArray[i][1];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        ActivitySelection obj=new ActivitySelection();
        List<Integer> start=Arrays.asList(1, 3, 2, 5);
        List<Integer> end=Arrays.asList(2, 4, 3, 6);
        System.out.println("Maximum number of activities: "+obj.activitySelection(start, end));
    }
}
