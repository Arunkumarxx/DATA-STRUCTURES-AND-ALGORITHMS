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
        double usdAmount = 2_000_000_000; // 2 billion USD
        double exchangeRate = 82; // 1 USD = 82 INR

        // Convert USD to INR
        double inrAmount = usdAmount * exchangeRate;

        // Convert INR to crores
        double croresAmount = inrAmount / 10_000_000; // 1 crore = 10 million

        System.out.printf("USD %.2f billion is equal to INR %.2f crores%n", usdAmount / 1_000_000_000, croresAmount);
    }
}
