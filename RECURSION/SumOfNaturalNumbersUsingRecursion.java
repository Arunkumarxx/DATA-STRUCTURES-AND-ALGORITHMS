package RECURSION;

 class SumOfNaturalNumbersUsingRecursion {

     static int recursion(int n ) {
         if (n==1)
             return 1;
         return n+recursion(n-1);
     }
     public static void main(String[] args) {
         int n=5;
        int res= recursion(n);
         System.out.println(res);
     }
}
