package SEARCHING;
public class IndexOfLastOccurrenceInSorted {
    static int firstIndex(long arr[],int n,int x) {
        int l=0;
        int r=n-1;
        int pos=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                pos=mid;
                r=mid-1;
            }
            else if(arr[mid]>x)
            {
                r=mid-1;
            }
            else l=mid+1;
        }
        return pos;
    }
    static int lastIndex(long arr[],int n,int x) {
        int l=0;
        int r=n-1;
        int pos=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                pos=mid;
                r=mid-1;
            }
            else if(arr[mid]>x)
            {
                r=mid-1;
            }
            else l=mid+1;
        }
        return pos;
    }
    public static void main(String[] args) {
       long arr[]   ={1,3,5,5,5,5,7,123,125};
        int result1 = firstIndex(arr, arr.length,7);
        int result2 =  lastIndex(arr, arr.length, 7);
        System.out.println(result1);
        System.out.println(result2);
    }
}
