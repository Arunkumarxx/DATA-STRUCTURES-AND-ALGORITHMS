package GREEDY;

import java.util.ArrayList;
import java.util.Arrays;
public class ActivitySelection
{
    private int getMaximumNumberOfActivity(int [] [] PairArray)
    {
        Arrays.sort(PairArray, (a, b) -> Integer.compare(a[1], b[1]));
        int prev=0;
        int n=PairArray.length;
        ArrayList<int []> result =new ArrayList<>();
        result.add(PairArray[0]);
        prev=PairArray[0][1];
        for(int i=1;i<n;++i)
        {
            int [] pair =PairArray[i];
            if(pair[0]>prev)
            {
                result.add(pair);
                prev=pair[1];
            }
        }
        result.forEach(a-> System.out.println(Arrays.toString(a)));
        return -1;
    }
    public static void main(String[] args)
    {
        ActivitySelection obj =new ActivitySelection();
         int [][] PairArray ={
                 {1,3},
                 {}
         };
         obj.getMaximumNumberOfActivity(PairArray);
    }
}
