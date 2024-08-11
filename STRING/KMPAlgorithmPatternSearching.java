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
        
    }
}
