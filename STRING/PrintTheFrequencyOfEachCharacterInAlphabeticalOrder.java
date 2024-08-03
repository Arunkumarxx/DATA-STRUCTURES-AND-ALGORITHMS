package STRING;

import java.util.Arrays;

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
        String s1 =new String("arun");
        String s2 =new String("arun");
        System.out.println(s1==s2);
    }
}
