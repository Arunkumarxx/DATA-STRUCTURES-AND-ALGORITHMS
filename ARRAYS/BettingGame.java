package ARRAYS;

public class BettingGame {
    public static void main(String[] args) {
        int bet =1;
        String result="WL";
        int balance=4;
        for(int i=0; i<result.length(); ++i)
        {
            if(balance<=0) {
                System.out.println("-1");
            }
            if(result.charAt(i)=='W')
            {
                balance+=bet;
            }
            if(result.charAt(i)=='L')
            {
                balance-=bet;
                bet*=2;
            }if(balance<bet&&i<result.length()-1) {
            System.out.println(-1);
            break;
        }
        }
        System.out.println(balance);
    }
}
