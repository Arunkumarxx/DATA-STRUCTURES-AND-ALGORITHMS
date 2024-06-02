package ARRAYS;
public class LongestEvenOddSubArray {
    static void LongestEvenOddSubarray (int [] arr){
        int n= arr.length;
        int count=1;
        int sum=1;
        if(arr.length>1){
        for(int i=1; i<n; i++)
        {
            if (arr[i]%2==0 && arr[i-1]%2!=0 ||arr[i]%2!=0 &&arr[i-1]%2==0) {
                sum++;
                count=Integer.max(sum,count);
            }
            else {
                sum = 1;
            }
        }
            System.out.println(count);
        }
        else System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int [] arr = {10,12,14,7,8};
        LongestEvenOddSubarray(arr);
        System.out.println();
    }
}
