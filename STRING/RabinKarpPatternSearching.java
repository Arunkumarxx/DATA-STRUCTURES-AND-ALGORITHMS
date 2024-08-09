package STRING;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {
        String str= "aaBaacaadaabaaba";
        String pattern = "aaba";
        System.out.println(RabinKarp_PatternSearching(str,pattern));
    }
    private static  boolean RabinKarp_PatternSearching(String str,String pattern) {
       int n1=str.length();
       int n2=pattern.length();

       if(n2>n1)
           return false;
       int StringHash=HashValue(str);
       int PatterHash=HashValue(str.substring(0,n2-1));
        System.out.println(StringHash);
        System.out.println(PatterHash);
        return false;
    }
    private static int HashValue(String str) {
        int hash=0;
        for(char x:str.toCharArray())
            hash+=(x-'a'+1);
        return hash;
    }

}
