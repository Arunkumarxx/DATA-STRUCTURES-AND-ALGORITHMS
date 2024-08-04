package STRING;

import java.util.Date;
import java.util.Locale;

class PrintTheFrequencyOfEachCharacterInAlphabeticalOrder {
    private static void PrintCharacterFreq(String str,int n) {

        int [] freq = new int[26];

        for (int i=0; i<n; ++i)
            ++freq[str.charAt(i)-'a'];

        for (int j=0; j<freq.length; ++j)
            System.out.println((char) (j+'a')+"->"+freq[j]);

    }
    public static void main(String[] args) {
        String str = "aabbccccddd";
        PrintCharacterFreq(str,str.length());
        long time =System.currentTimeMillis();
        int value=12000;
        System.out.println(String.format(Locale.FRANCE,"%.2f",value));
    }
}
