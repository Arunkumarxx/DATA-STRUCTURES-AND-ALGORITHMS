package STRING;
import java.util.Arrays;

public class CheckIfStringsAreRotations {

    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="forgeeksgeeks";
        System.out.println(isStringsAreRotations(s1,s2));
    }
    private static boolean isStringsAreRotations(String s1,String s2) {
        int [] lsp=new int[s2.length()];
        BuildLSP(s2,lsp);
        String concat = s1+s1;
        int n1=s1.length();
        int n2=s2.length();
        int j=0;
        int count=0;
        for(int i=0; i<n1; ++i)
        {
            if(count==n2)
                return true;
            if(concat.charAt(i)==s2.charAt(j))
            {
                ++i;
                ++j;
                ++count;
            }
            if(j==n2)
                return true;
            if(i<n1 && concat.charAt(i)!=s2.charAt(j))
                if(j!=0)
                    j=lsp[j-1];
                else ++i;

        }
        return false;
    }
    private static void BuildLSP(String pattern,int [] lsp) {
        int i=0;
        lsp[i]=0;
        int j=1;
        int n=pattern.length();
        while(j<n)
        {
            if(pattern.charAt(i)==pattern.charAt(j))
            {
                ++i;
                lsp[j]=i;
                ++j;
            }
            else {
                if(i!=0)
                    i=lsp[i-1];
                else {
                    lsp[j]=0;
                    ++j;
                }
            }
        }
        System.out.println(Arrays.toString(lsp));
    }
    private static boolean kmp(String str,String pattern) {
        return false;
    }
}
