package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str ="forxxorfxdofr";
        String patt ="for";
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
        int j=0;
        for(int i=0; i<n; ++i)
        {
            hash1-=(str.charAt(i)-'a');
            hash1+=(str.charAt(i+j)-'a');
            if(hash1==hash2)
                ++count;
        }
        System.out.println(count);
    }
}
