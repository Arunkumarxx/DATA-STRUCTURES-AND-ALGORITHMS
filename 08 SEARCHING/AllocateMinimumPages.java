package SEARCHING;

public class AllocateMinimumPages {
    static int binarySearch(int [] arr,int n,int students) {
        int left=0;
        int right=n-1;
        int Min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int l=arr[0];
        int r=0;
        for (int i=0; i<n; i++)
        {
            if(arr[0]<l) l=arr[i];
            r+=arr[i];
        }
        int res=arr[0];
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(isPossible(arr,n,mid,students))
            {
                res=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
    static boolean isPossible(int[] arr,int n,int mid,int students) {
        int sum=0;
        int s=1;
        for (int i=0;i<n;i++)
        {
            if(arr[i]>mid)
                return false;
            if(sum+arr[i]<=mid)
                sum+=arr[i];
            else {
                s++;
                if(s>students)
                    return false;
                sum=arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr ={15,17,20};
        int students=2;
        int res=binarySearch(arr, arr.length,students);
        System.out.println(res);
    }
}
