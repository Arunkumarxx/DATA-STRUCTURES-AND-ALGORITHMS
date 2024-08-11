package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str = "babgfcbceyhjugixwtbvtrehb";
        String patt = "b";
        System.out.println(SlidingWindowWithHashing(str,patt));
        System.out.println(String.valueOf(str.charAt(0)).hashCode());
        System.out.println(String.valueOf(str.charAt(2)).hashCode());
    }
    private static int SlidingWindowWithHashing(String str,String pattern) {
        if(pattern.length()>str.length())
            return 0;
        int count=0;
        if(pattern.length()==1)
            for(char x:str.toCharArray())
                if(x==pattern.charAt(0))
                    ++count;
        if(count>0)
            return count;
        int k=pattern.length();
        int hash1=pattern.hashCode();
        int hash2=str.substring(0,pattern.length()).hashCode();
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
