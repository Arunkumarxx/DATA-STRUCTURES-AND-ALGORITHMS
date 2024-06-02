package RECURSION;
public class LuckyNumbersUsingRecursion {
    static boolean LuckyNumbers(int n,int Count) {
        if (n<Count)
            return true;
        if (n%Count==0)
            return false;
       return LuckyNumbers(n-(n/Count),Count+1);
    }
    public static void main(String[] args) {
       System.out.println(); LuckyNumbers(19,2);

    }
}