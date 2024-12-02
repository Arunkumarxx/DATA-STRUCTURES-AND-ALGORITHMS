package DYNAMIC_PROGRAMMING;

public class MinimumNumberOfJumps
{
    private  int minimumJumps(int arr[], int n)
    {
        if(n<=1)
            return 0;
        if(arr[0]==0)
            return 1;
        int jumps=1;
        int steps=arr[0];
        int maxReach=arr[0];

        for(int i=1;i<n;++i)
        {
            if(i==n-1)
                return jumps;
            if(arr[i]+i>maxReach)
                maxReach=arr[i]+i;
            --steps;
            if(steps==0)
            {
                ++jumps;
                if(i>=maxReach)
                    return -1;
                steps=maxReach-i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int [] arr ={1,3,5,8,9,2,6,7,6,8,9};
        MinimumNumberOfJumps obj =new MinimumNumberOfJumps();
        System.out.println(obj.minimumJumps(arr,arr.length));
    }
}
