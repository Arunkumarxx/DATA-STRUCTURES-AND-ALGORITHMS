package STRING;

import java.util.Arrays;
import java.util.HashSet;

public class KMPAlgorithmPatternSearching {
    public static void main(String[] args) {
        String str ="abcabab abababaabac";
        String pattern ="ababaaba";
        int [] lps =new int[pattern.length()];
        BuildLongestPrefixSuffix(pattern,pattern.length(),lps);
        int n=str.length();
        int n2=pattern.length();
        int j=0;
        int i=0;
        while(i<n && j<n2)
        {
            if(str.charAt(i)==pattern.charAt(i))
            {
                ++i;
                ++j;
            }
            else {
                
            }
        }
    }
    private static void BuildLongestPrefixSuffix(String pattern,int n,int [] lps) {
        int i=0;
        int j=1;
        lps[i]=0;
        while(j<n)
        {
            if(pattern.charAt(i)==pattern.charAt(j))
            {
                ++i;
                lps[j]=i;
                ++j;
            }
            else {
                if(i!=0)
                    i=lps[i-1];
                else {
                    lps[j]=0;
                    ++j;
                }
            }
        }
        System.out.println(Arrays.toString(lps));
    }
}
