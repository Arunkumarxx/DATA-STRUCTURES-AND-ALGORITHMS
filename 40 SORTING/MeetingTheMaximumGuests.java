package SORTING;

import java.util.Arrays;

public class MeetingTheMaximumGuests {
  static int   MeetingMax(int [] start,int []end ,int n){
      Arrays.sort(start);
      Arrays.sort(end);
      int i=1;
      int j=0;
      int count=1;
      int maxGuest=Integer.MIN_VALUE;
      while(i<n&&j<n){
          if(end[j]>=start[i])
          {
              i++;count++;

          }
          else {
              count--;
              j++;
          }
          maxGuest=Math.max(count,maxGuest);
      }
      return maxGuest;
    }
    public static void main(String[] args) {
        int [] start = {900,700,600};
        int [] end   = {1000,800,730};
         int res= MeetingMax(start,end,start.length);
        System.out.println(res);
    }
}