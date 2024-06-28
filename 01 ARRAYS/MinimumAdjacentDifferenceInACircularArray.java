package ARRAYS;
public class MinimumAdjacentDifferenceInACircularArray {
    public static void main(String[] args) {
        int [] arr ={8 ,-8, 9 -9 ,10 ,-11, 12};
        int n= arr.length;
        int min=Integer.MAX_VALUE;
        for (int i=1; i<n; i++)
        {
            int x=Math.abs(arr[i]-arr[i-1]);
            if(x<min)
                min=x;
        }
        if (Math.abs(arr[n-1]-arr[0])<min)
            min=Math.abs(arr[n-1]-arr[0]);
        System.out.println(min);
    }
}
