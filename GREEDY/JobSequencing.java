package GREEDY;

import java.util.*;

class Job
{
    int id;
    int deadline;
    int profit;
    Job(int id, int deadline, int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
public class JobSequencing {

    private ArrayList<Integer> JobScheduling(Job jobs[], int n)
    {
        Arrays.sort(jobs, (a, b)->b.profit-a.profit);
        int maxDeadLine=0;
        int totalJobs=0;
        int maxProfit=0;
        for(Job j:jobs)
            if(j.deadline>maxDeadLine)
                maxDeadLine=j.deadline;
        boolean[] slot=new boolean[maxDeadLine+1];
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
        ArrayList<Integer> result=new ArrayList<Integer>();
        result.add(totalJobs);
        result.add(maxProfit);
        return result;
    }

    public static void main(String[] args)
    {
        JobSequencing obj=new JobSequencing();
        Job[] jobs=new Job[5];
        jobs[0]=new Job(1, 4, 20);
        jobs[1]=new Job(2, 1, 10);
        jobs[2]=new Job(3, 1, 40);
        jobs[3]=new Job(4, 1, 30);
        jobs[4]=new Job(5, 2, 50);
        ArrayList<Integer> result=obj.JobScheduling(jobs, jobs.length);
        System.out.println("Number of jobs done: "+result.get(0));
        System.out.println("Total profit: "+result.get(1));
    }
}

