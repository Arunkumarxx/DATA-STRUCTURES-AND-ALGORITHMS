package RECURSION;
 class DecimalToBinaryNumberUsingRecursion {
     static void RecursionDecimal(int n) {
         if (n==0)
             return;
         RecursionDecimal(n/2);
         if (n==1) {
             System.out.print(1);
         }
        else if (n==0) {
             System.out.println(0);
         }
        else {
         System.out.print(n%2);
         }
     }
     public static void main(String[] args) {
         int input=1048576;
         RecursionDecimal(input);
     }
 }