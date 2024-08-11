package STRING;

import java.util.Arrays;
import java.util.HashSet;

public class KMPAlgorithmPatternSearching {
    public static void main(String[] args) {
        String str ="aaba";
        String pattern ="ababaaba";
        int [] lps =new int[pattern.length()];
        BuildLongestPrefixSuffix(pattern,pattern.length(),lps);
    }
    private static void BuildLongestPrefixSuffix(String pattern,int n,int [] lps) {
        int i=0 ,j=1;
        System.out.println(Arrays.toString(lps));
        while(i<j && j<n)
        {
            if(pattern.charAt(i)==pattern.charAt(j)) {
                lps[j] = i + 1;
                ++i;
                ++j;
            }
            else if(i!=0){
                --i;
            }
            else ++j;
        }
        System.out.println(Arrays.toString(lps));
    }
}
