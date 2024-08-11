package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str = "wljfrimpmyhchzriwkbarxbgfcbceyhjugixwtbvtrehb";
        String patt = "po";
        System.out.println(SlidingWindowWithHashing(str,patt));
    }
    private static int SlidingWindowWithHashing(String str,String pattern) {
        if(pattern.length()>str.length())
            return 0;
        int k=pattern.length();
        int hash1=pattern.hashCode();
        int hash2=str.substring(0,pattern.length()).hashCode();
        int count=0;
        int n=str.length();
        if(hash1==hash2)
            ++count;
        for(int i=1; i<=n-k; ++i)
        {
            hash1-=String.valueOf(str.charAt(i-1)).hashCode();
            hash1+=String.valueOf(str.charAt(i+(k-1))).hashCode();
            if(hash1==hash2)
                ++count;
        }
        return count;
    }
}
