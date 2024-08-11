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
        int hash1=0;
        int hash2=0;
        int n=str.length();

        for(int i=0; i<k;++i) {
            hash1 += str.charAt(i) - 'a';
            hash2+= pattern.charAt(i)-'a';
        }
        int count=0;
        if(hash1== hash2)
            ++count;
        for(int i=0; i<=n-k; ++i)
        {
            hash1-=(str.charAt(i)-'a');
              if(i+k<n)  hash1 += (str.charAt(i + k) - 'a');
            if(hash1==hash2)
                ++count;
        }
        if(hash1==hash2)
            ++count;
        return count;
    }
}
