package STRING;

import java.text.DecimalFormat;
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
        int value =10002323;
        DecimalFormat decimalFormat =new DecimalFormat("#,###");
        String strss =decimalFormat.format(value);
        System.out.println(strss);
    }
}
