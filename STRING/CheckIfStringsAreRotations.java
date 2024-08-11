package STRING;
import java.util.Arrays;

public class CheckIfStringsAreRotations {

    public static void main(String[] args) {
        String s1="amazon";
        String s2="azonam";
        System.out.println(isStringsAreRotations(s1,s2));
    }
    private static boolean isStringsAreRotations(String s1,String s2) {
        int [] lsp=new int[s2.length()];
        BuildLSP(s2,lsp);
        String concat = s1+s1;
        int n=concat.length();
        int n2=s2.length();
        int j=0;
        int i=0;
        while(i<n && j<n2)// kmp algorithm
        {
            if(concat.charAt(i)==s2.charAt(j))
            {
                ++i;
                ++j;

            }
            if(j==n2 )
                return true;
            if(i<n && concat.charAt(i)!=s2.charAt(j))
                if(j!=0)
                    j=lsp[j-1];
                else ++i;

        }
        return false;
    }
    private static void BuildLSP(String pattern,int [] lps) {
        int i=0;
        int j=1;
        lps[i]=0;
        int n=pattern.length();
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

    }
}
