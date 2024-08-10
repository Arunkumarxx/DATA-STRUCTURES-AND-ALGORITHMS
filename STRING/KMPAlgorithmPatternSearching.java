package STRING;

public class KMPAlgorithmPatternSearching {
    public static void main(String[] args) {
        String str ="aabaacaadaabaaba";
        String pattern ="aaaab";
    }
    private boolean  kmp(String str,String pattern) {
        int n1=str.length();
        int n2=pattern.length();
        int i=0 ,j=0;
        while(i<n1 && j<n2)
        {
            if(j==n2-1)
                return true;
            if(str.charAt(i)==pattern.charAt(i))
            {
                ++i;
                ++j;
            }
            else {
                j=longestPrefix( str, pattern, i, j);
            }
        }
    }
    private static int  longestPrefix(String str,String pattern,int i,int j) {
        for(int k=j;k>=0; --k)
        {
            
        }
    }
}
