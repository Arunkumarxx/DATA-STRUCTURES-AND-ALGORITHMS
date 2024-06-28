package RECURSION;
public class RopeCuttingUsingRecursion {
    static  int RopeCutting(int x,int a,int b, int c) {
        if (x==0)
            return 0;
        if (x<0)
            return -1;

  int  max= Math.max( Math.max(RopeCutting(x-a,a,b,c)
            ,RopeCutting(x-b,a,b,c)),RopeCutting(x-c,a,b,c));

   if (max<0)
       return -1;
   else
       return max+1;

    }
    public static void main(String[] args) {
        int n = 15;
        int a = 5;
        int b = 3;
        int c = 3;
        int pics = 0;
        int max=0;
        int res = RopeCutting(n, a, b, c);
        System.out.println(res);
        System.out.println(224.7*8.3);
    }

}