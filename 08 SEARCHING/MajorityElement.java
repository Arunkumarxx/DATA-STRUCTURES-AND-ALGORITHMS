package SEARCHING;
public class MajorityElement {
    static int major(int a[],int size) {
        int ele=a[0];
        int count=1;
        for(int i=1; i<size; i++)
        {
            if(ele==a[i]){
                count++;
            }
            else {
                count--;
                if(count<0)
                {
                    ele=a[i];
                    count=1;
                }
            }
        }
        int coMoreOccured=0;
        for(int i=0 ;i<size; i++)
        {
            if(a[i]==ele)
                coMoreOccured++;
        }
        if(coMoreOccured>size/2)
            return coMoreOccured;
        return -1;
    }
    public static void main(String[] args) {
       int [] a = {3,1,3,3,2};
     int res=  major(a,a.length);
        System.out.println(res);
    }
}