package STRING;

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
    }
}
