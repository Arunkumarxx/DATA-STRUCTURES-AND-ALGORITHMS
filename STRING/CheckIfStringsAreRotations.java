package STRING;

import MATRIX.SumOfUpperAndLowerTriangles;

public class CheckIfStringsAreRotations {

    public static void main(String[] args) {
        String s1="ABAAA";
        String s2="BAAAA";
        System.out.println(isStringsAreRotations(s1,s2));
    }
    private static boolean isStringsAreRotations(String s1,String s2) {

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
                ++j;
            }
            else {
                if(i!=0)
                    i=lsp[i-1];
                else ++j;
            }
        }
    }
    private static boolean kmp(String str,String pattern) {
        
    }
}
