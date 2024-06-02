package ARRAYS;

public class WhoIsMajor {
    static int Major(int[] arr,int x,int y) {
        int x1=0;
        int y1=0;
        int result=0;
        int n= arr.length;
        for(int i=0; i<n; i++)
        {
            if(x==arr[i]) x1++;
            if(y==arr[i]) y1++;
        }
        result=x1>y1?x:y;
        if(x1==y1) return Math.min(x,y);
        return result;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8};
        int x=1;
        int y=7;
      int result=  Major(arr,x,y);
        System.out.println(result);
    }
}
