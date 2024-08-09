package STRING;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {
        String str= "aabcacaadaabaaba";
        String pattern = "aaba";
        System.out.println(RabinKarp_PatternSearching(str,pattern));
    }
    private static  boolean RabinKarp_PatternSearching(String str,String pattern) {
        if(str.length()<pattern.length())
            return false;
        int k=0;
        int n1=str.length();
        int n2=pattern.length();
        for(int i=0;i<n2;++i)
            k+=pattern.charAt(i)-'a'+1;

        int sum=0;
        for(int i=0; i<n2; ++i)
            sum+=str.charAt(i)-'a'+1;

        if(k==sum && str.charAt(0)==pattern.charAt(0) && patternSearch(0,pattern.length()-1,str,pattern))
            return true;

        return false;
    }
    private static boolean patternSearch(int start,int end,String str,String pattern) {
        int n1=str.length();
        int n2=pattern.length();
        for(int i=0; i<=n1-n2; ++i)
        {
            if(str.charAt(i)==pattern.charAt(0))
            {
                boolean coundValid=true;
                for(int j=0; j<pattern.length(); ++j)
                {
                    if(str.charAt(i+j)!=pattern.charAt(j)) {
                        coundValid = false;
                        break;
                    }
                }
                if(coundValid)
                    return true;
            }
        }
        return false;
    }
}
