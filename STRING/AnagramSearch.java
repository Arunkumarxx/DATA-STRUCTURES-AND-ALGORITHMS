package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str ="BACDGABCDA";
        String patt ="ABCD";
        int k=patt.length();
        int hash1=0;
        int hash2=0;
        int n=str.length();

        for(int i=0; i<k;++i) {
            hash1 += patt.charAt(i) - 'a';
            hash2+= str.charAt(i)-'a';
        }
        int count=0;
        if(hash1== hash2)
            ++count;
        for(int i=0; i<n-k; ++i)
        {
            hash1-=(str.charAt(i)-'a');
            hash1+=(str.charAt(i+k)-'a');
            if(hash1==hash2)
                ++count;
        }
        System.out.println(count);
    }
}
