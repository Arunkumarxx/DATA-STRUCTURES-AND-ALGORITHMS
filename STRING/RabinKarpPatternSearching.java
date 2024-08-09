package STRING;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {
        String str= "aabaacaadaabaaba";
        String pattern = "aaba";
        System.out.println(RabinKarp_PatternSearching(str,pattern));
    }
    private static  int RabinKarp_PatternSearching(String str,String pattern) {
        int k=0;
        int n1=str.length();
        int n2=pattern.length();
        for(int i=0;i<n2;++i)
            k+=('a'-pattern.charAt(i)+1);
        System.out.println(k);
        System.out.println(97);
        return -1;
    }
}
