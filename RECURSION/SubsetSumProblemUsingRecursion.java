package RECURSION;
public class SubsetSumProblemUsingRecursion{
    static int  subsetOfSumUsingRecursion(int arr[],int sum,int i) {
        if (sum==0)
            return 1;

        if ((i== arr.length)||(sum<0))
            return 0;

      return   subsetOfSumUsingRecursion(arr,sum-arr[i],i+1)+
               subsetOfSumUsingRecursion(arr,sum,i+1);
    }
    public static void main(String[] args) {
       int arr[]  = {10,20,15};
       int sum= 0;
       int res= subsetOfSumUsingRecursion(arr,sum, 0);
       System.out.println(res);
    }
}