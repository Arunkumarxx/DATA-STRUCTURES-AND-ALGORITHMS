package RECURSION;
 class SumOfDigitOfANumberUsingRecursion {
     static int  SumOfDigitUsingRecursion(int n) {
         if (n==0)
             return 0;
        return SumOfDigitUsingRecursion(n/10)+n%10;
        /*
        525 7+10
        52 5+2
        5  5+0
        0
        if want last number use digit.... %10
        if want to remove last number digit...../10
         */
     }
     public static void main(String[] args) {
         int input =123;
       int result  =  SumOfDigitUsingRecursion(input);
         System.out.println(result);


     }

}
