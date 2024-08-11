package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str = "AABBAAC";
        String patt = "A";
        
        System.out.println(SlidingWindowWithHashing(str,patt));
    }
    private static int SlidingWindowWithHashing(String str,String pattern) {
        if(pattern.length()>str.length())
            return -1;
        int k=pattern.length();
        int hash1=0;
        int hash2=0;
        int n=str.length();

        for(int i=0; i<k;++i) {
            hash1 += pattern.charAt(i) - 'a';
            hash2+= str.charAt(i)-'a';
        }
        int count=0;
        if(hash1== hash2)
            ++count;
        for(int i=0; i<n-k; ++i)
        {
            hash1-=(str.charAt(i)-'a');
            hash1+=(str.charAt(i+k)-'a');
            if(hash1==hash2) {
                ++count;
            }
        }
        return count;
    }
}
