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

        

    }
}
