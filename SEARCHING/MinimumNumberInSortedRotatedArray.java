package SEARCHING;

public class MinimumNumberInSortedRotatedArray {
    static int binarySearch() {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int l=0;
        int r= arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r) {
            int mid=(l+r)/2;
            if(arr[l]<=arr[r])
                ans=Math.min(ans,arr[l]);
            if(arr[l]<=arr[mid] )
            {
                l=mid+1;
                ans=Math.min(ans,arr[mid]);
            }
            else if (arr[mid] <= arr[r]){
                r = mid - 1;
                ans=Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch());
    }
}
