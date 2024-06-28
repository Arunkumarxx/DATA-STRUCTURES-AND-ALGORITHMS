package RECURSION;

public class CountTotalDigitsInANumber {
    static int  digit(int n,int c){
        if (n<=9)
            return 1;
       return digit(n/10,c)+1;
    }
    public static void main(String[] args) {
       int res= digit(52,0);
        System.out.println(res);
    }
}
