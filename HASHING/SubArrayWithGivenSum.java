package HASHING;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={1,4,20,3,10,5};
        int n= arr.length;
        int i=0 ,j=0;
        int target=33;
        int sum=0;
        while(j<n)
        {
            sum+=arr[j];
           while(sum>target && i<=j)
               sum-=arr[i++];
           if(sum==target)
           {
               System.out.println(i+" "+j);
               return;
           }
           j++;
        }
    }

}
