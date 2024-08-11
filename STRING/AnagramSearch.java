package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str = "zbcoejuvpvaboyg";
        String patt = "po";
        System.out.println(SlidingWindowWithHashing(str,patt));
    }
    private static int SlidingWindowWithHashing(String str,String pattern) {
        if(pattern.length()>str.length())
            return 0;
        int k=pattern.length();
        int hash1=pattern.hashCode();
        int hash2=str.substring(0,pattern.length()).hashCode();
        System.out.println(str.substring(0,2));
        System.out.println(hash1);

        return 0;
    }
}
