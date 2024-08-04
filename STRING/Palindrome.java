package STRING;

public class Palindrome {
    public static void main(String[] args) {
        String str= "mo";
        System.out.println(isPalindromeString(str));
    }
    private static boolean isPalindromeString(String str) {

        int start=0,end=str.length()-1;

        while(start<end)
            if(!(str.charAt(++start)==str.charAt(--end)))
                return false;
        return true;
    }
}
