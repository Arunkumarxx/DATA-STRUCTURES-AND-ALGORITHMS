package ARRAYS;
public class LongestSubArrayOfEvensAndOdds {
    static int LongestSubArrayEvenAndOdd(int [] arr,int n) {
        int sum=1;
        int maxLen=1;
        for(int i=1; i<n; i++)
        {
            if(arr[i]%2!=arr[i-1]%2) {
                sum++;
                if(sum>maxLen)
                    maxLen+=sum-maxLen;
            }

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int [] arr ={3,2,5,4};
        //           o e o e
        int n= arr.length;
        LongestSubArrayEvenAndOdd(arr,n);
    }
}
