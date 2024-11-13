package GREEDY;

import java.util.Arrays;
public class ActivitySelection
{
    private int getMaximumNumberOfActivity(int [] [] PairArray)
    {
        Arrays.sort(PairArray, (a, b) -> Integer.compare(a[1], b[1]));
        int currStart=0;
        int currEnd=0;
        int n=PairArray.length;
        for(int i=0;i<n;++i)
        {
            
        }
        return -1;
    }
    public static void main(String[] args)
    {
        ActivitySelection obj =new ActivitySelection();
         int [][] PairArray ={
                 {3,8},
                 {2,4},
                 {1,3},
                 {10,11}
         };
         obj.getMaximumNumberOfActivity(PairArray);
    }
}
