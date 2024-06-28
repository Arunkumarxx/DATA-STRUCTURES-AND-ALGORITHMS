package SEARCHING;

public class CountOnesInSortedBinaryArray {
    static int last(int [] arr,int n) {
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==0)
                r=mid-1;
            else if(mid!=n-1) {
                if(arr[mid+1]==0 ){
                    return mid+1;

                } else l=mid+1;

            }else return mid+1;

        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr ={ 1,1,1,0,0,0};
        int n= arr.length;
        int x=1;
        int res=last(arr,n);
        System.out.println(res);

    }
}
