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
        System.out.println(k);
        int sum=0;
        for(int i=0; i<n2; ++i)
        {
            sum+=str.charAt(i)-'a'+1;
        }
        
        return true;

    }
}
