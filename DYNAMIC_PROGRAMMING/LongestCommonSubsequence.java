package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence
{

    private int getLCS(String s1,String s2)
    {
        // a b d a c e
        // b a b c e

        int n1=s1.length();
        int n2=s2.length();

        for(int i=0;i<n1;++i)
        {
            
        }
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence obj=new LongestCommonSubsequence();
        System.out.println(obj.getLCS("ABCDGH","AEDFHR"));
    }

}
