package STRING;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {
        String str= "aabaacaadaabaaba";
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

        if(k==sum)
          return   patternSearch(0,pattern.length()-1,str,pattern);

        return false;
    }
    private static boolean patternSearch(int start,int end,String str,String pattern) {
        int n2=pattern.length();
        for(int i=start;i<=end-n2; ++i)
        {
            boolean patternFound=true;
            for(int j=0; j<n2; ++j)
            {
                if(str.charAt(i+j)!=pattern.charAt(j))
                {
                    patternFound=false;
                    break;
                }

            }
            if(patternFound)
                return true;
        }
    }
}
