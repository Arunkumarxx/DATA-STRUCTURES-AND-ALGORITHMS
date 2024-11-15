package GREEDY;

import  java.util.*;
public class JobSequencing
{
   private ArrayList<Integer> JobScheduling(Job jobs[], int n) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadLine=0;
        int totalJobs=0;
        int maxProfit=0;

        for(Job j:jobs)
            if(j.deadline>maxDeadLine)
                maxDeadLine=j.deadline;
        boolean [] slot =new boolean [maxDeadLine+1];
        for(Job j:jobs)
        {
            for(int i=j.deadline;i>0;--i)
            {
                if(!slot[i])
                {
                    slot[i]=true;
                    ++totalJobs;
                    maxProfit+=j.profit;
                    break;
                }
            }
        }
        ArrayList<Integer> result =new ArrayList<Integer>();
        result.add(totalJobs);
        result.add(maxProfit);
        return result;
    }

    public static void main(String[] args)
    {

    }
}
