package SEARCHING;
public class SquareRoot {
    static float SquareRoot(int x) {
        int l=0;
        int r=x/2;
        int res=0;
        float mid=0;
        while (l<=r)
        {
             mid=(l+r)/2;
            if(mid*mid==x)
                return mid;
         else if(mid*mid>x)
             r=(int)mid-1;
         else l=(int)mid+1;
        }
        return mid;
    }
    public static void main(String[] args) {
        float x=2;
     int  res= (int)SquareRoot((int)x);
        System.out.println(res);
    }
}
