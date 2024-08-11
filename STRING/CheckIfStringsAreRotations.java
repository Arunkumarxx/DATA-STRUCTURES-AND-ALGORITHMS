package STRING;

import MATRIX.SumOfUpperAndLowerTriangles;

public class CheckIfStringsAreRotations {

    public static void main(String[] args) {
        String s1="ABAAA";
        String s2="BAAAA";
        System.out.println(isStringsAreRotations(s1,s2));
    }
    private static boolean isStringsAreRotations(String s1,String s2) {
        if(s1==s2)
            return true;
        int n1=s1.length();
        int n2=s2.length();
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(s1);
        for(int i=0; i<n1; ++i)
        {
            stringBuilder.delete(0,1);
            stringBuilder.append(s1.charAt(i));
            if(stringBuilder.toString().equals(s2))
                return true;
        }
        return false;
    }
}
