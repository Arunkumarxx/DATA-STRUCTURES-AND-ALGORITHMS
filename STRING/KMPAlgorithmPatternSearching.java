package STRING;

import java.util.Arrays;
import java.util.HashSet;

public class KMPAlgorithmPatternSearching {
    public static void main(String[] args) {
        String str ="aaba";
        String pattern ="ababaaba";
        int [] lps =new int[str.length()];
        BuildLongestPrefixSuffix(str,str.length(),lps);
    }
    private static void BuildLongestPrefixSuffix(String str,int n,int [] lps) {
        int i=0 ,j=1;
        System.out.println(Arrays.toString(lps));
        while(i<j && j<n)
        {
            i++;
            j++;
        }
    }
}
