package ARRAYS;
public class EquilibriumPoint {
    public static void main(String[] args) {
        int []arr  ={5,2,2,4,3,4,2};
       int sum=0;
       for (int i=0; i< arr.length; i++)
       {
           sum+=arr[i];
       }
       int sum2=0;
       for (int i=0; i< arr.length; i++)
       {
           sum-=arr[i];
           if(sum==sum2) {
               System.out.println(i);
               break;
           }
           sum2+=arr[i];
       }
    }
}
