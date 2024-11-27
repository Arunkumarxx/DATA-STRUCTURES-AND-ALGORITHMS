package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence
{

    private int getLCS(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();

        for(int i=0;i<n2;++i)
        {
            int indOne=0;
            int indTwo=0;
            int count=0;

        }
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence obj=new LongestCommonSubsequence();
        System.out.println(obj.getLCS("ABCDFH","AEDFHR"));
    }

}
