package RECURSION;
 class ProgramForFactorialOfANumberUsingRecursion {
     static int  factorialNumber(int n) {
         if (n==0)
             return 1;
         return n*factorialNumber(n-1);
     }
     public static void main(String[] args) {
         int res= factorialNumber(0);
         System.out.println(res);
     }
}