package SORTING;

import java.util.Arrays;
import java.util.Comparator;

public  class NmeetingINOneRoom  {
    static class  meetings {
        int start;
        int end;
        meetings(int start,int end) {
            this.start=start;
            this.end=end;
        }
    }
    static int maxMeetings(int [] start ,int [] end ,int n) {
        if(n==1)
            return 1;
        meetings [] meetingsList = new meetings[n];
        for (int i=0;i<n; i++)
        {
            meetingsList[i]=new meetings(start[i],end[i]);
        }
        Arrays.sort(meetingsList, Comparator.comparing((a)->a.end));
        int count=1;
        int ends=meetingsList[0].end;
        for (int i=1; i<n; i++)
        {
            if(meetingsList[i].start>=ends)
            {
                count++;
                ends=meetingsList[i].end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] start=  {1, 2, 9, 5, 5};
        int [] end  =  {4, 5, 12, 9, 12};
        int n=start.length;
       int res= maxMeetings(start,end,n);
        System.out.println(res);
    }
}