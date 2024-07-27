package HASHING;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={1,4,20,3,10,5};
        int n= arr.length;
        int i=0 ,j=0;
        int target=33;
        int sum=0;
        while(i<=j && j<n)
        {
            if(sum==target)
            {
                System.out.println(arr[i]+" "+arr[j]);
                break;
            }
            if(sum<target)
            {
                sum+=arr[j];
                ++j;
            }
            else
            {
                sum-=arr[i];
                ++i;
            }
        }
    }

}
