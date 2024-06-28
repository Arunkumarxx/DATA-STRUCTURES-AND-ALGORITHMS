package RECURSION;
public class NthFibonacciUsingRecursion {
    static int NthFibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
      return  NthFibonacci(n-1)+NthFibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=3;
        for (int i=0; i<n; i++){
            System.out.print(NthFibonacci(i)+" ");
        }
    }
}