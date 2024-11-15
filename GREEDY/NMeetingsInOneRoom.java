package GREEDY;

import java.util.*;


public class NMeetingsInOneRoom
{
    private class meetings
    {
        int start;
        int end;
        meetings(int start, int end)
        {
            this.start=start;
            this.end=end;
        }
    }

    private int maxMeetings(int start[], int end[])
    {
        int n=start.length;
        meetings[] m=new meetings[n];
        for(int i=0;i<n;++i)
            m[i]=new meetings(start[i], end[i]);

        Arrays.sort(m, Comparator.comparing((a)->a.end));
        int count=1;
        int prev=m[0].end;
        for(int i=1;i<n;++i)
        {
            if(m[i].start>prev)
            {
                ++count;
                prev=m[i].end;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        NMeetingsInOneRoom obj=new NMeetingsInOneRoom();
        int[] start={1, 3, 0, 5, 8, 5};
        int[] end={2, 4, 6, 7, 9, 9};
        System.out.println("Maximum number of meetings: "+obj.maxMeetings(start, end));
    }
}
