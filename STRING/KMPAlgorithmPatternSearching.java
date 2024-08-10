package STRING;

public class KMPAlgorithmPatternSearching {
    public static void main(String[] args) {
        String str ="aabaacaadaabaaba";
        String pattern ="caada";
        System.out.println(kmp(str,pattern));
    }
    private static boolean  kmp(String str,String pattern) {
        int n1=str.length();
        int n2=pattern.length();
        int i=0 ,j=0;
        while(i<n1 && j<n2)
        {
            if(j==n2-1)
                return true;
            if(str.charAt(i)==pattern.charAt(j))
            {
                ++i;
                ++j;
                continue;
            }
            else {
                int ind=longestPrefix(str,pattern,i,j);
                if(ind!=-1)
                {
                    j=ind;
                }
                else
                    j=0;
            }
            ++i;
        }
        return false;
    }
    private static int  longestPrefix(String str,String pattern,int i,int j) {
        for(int k=j;k>=0; --k)
        {
            if(str.charAt(i)==pattern.charAt(k))
                return k;
        }
        return -1;
    }
}
