package STRING;

public class NthNumberMadeOfPrimeDigits {
    public static void main(String[] args) {
        int n=10;
        System.out.println(primeDigits(n));
    }
    private static int primeDigits(int n) {
        int [] arr ={2,3,5,7};
        StringBuilder stringBuilder =new StringBuilder();
        while(n>0)
        {
            stringBuilder.insert(0,arr[(n-1)%4]);
            n=(n-1)/4;
        }
//        System.out.println(stringBuilder);
        return Integer.parseInt(stringBuilder.toString());
    }
}
