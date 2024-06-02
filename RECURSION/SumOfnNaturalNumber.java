package RECURSION;
public class SumOfnNaturalNumber {
    static int   Recursion(int n) {
        if (n==0) {
            return 0;
        }
      return n+ Recursion(n-1);
    }
    public static void main(String[] args) {
       int x= Recursion(4);
        System.out.println(x);
    }
}