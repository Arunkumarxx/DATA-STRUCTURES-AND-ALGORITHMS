package ARRAYS;

class whatIsRecursion {
     static void countNumberUsingIterative(int n) {
          int ans = 0;
          while (n <= 5){
               ans+=n;
               n++;
          }
          System.out.println(ans);
     }
     static int countNumberUsingRecursion(int n) {
          if (n==1){
               return 1;
          }
          else {
               return n+ countNumberUsingRecursion(n-1);
          }
     }
     public static void main(String[] args) {
          int n=0;
          countNumberUsingIterative(n);
          System.out.println(countNumberUsingRecursion(5));
     }
}