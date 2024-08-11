package STRING;
import java.util.Arrays;
public class KMPAlgorithmPatternSearching {
    public static void main(String[] args) {
        String str ="abcabab abababaabac";
        String pattern ="forgeeksgeeks";
        int [] lps =new int[pattern.length()];
        BuildLongestPrefixSuffix(pattern,pattern.length(),lps);
        System.out.println(KMP_Alogrithm(str,pattern,lps));
    }
    private static boolean KMP_Alogrithm(String str,String pattern,int [] lps) {
        int n=str.length();
        int n2=pattern.length();
        int j=0;
        int i=0;
        while(i<n && j<n2)
        {
            if(str.charAt(i)==pattern.charAt(j))
            {
                ++i;
                ++j;

            }
            if(j==n2 )
                return true;
           if(i<n && str.charAt(i)!=pattern.charAt(j))
                if(j!=0)
                    j=lps[j-1];
                else ++i;

        }
        return false;
    }
    private static void BuildLongestPrefixSuffix(String pattern,int m,int [] lps) {
        int i=0;
        int j=1;
        lps[i]=0;
        while(j<m)
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
