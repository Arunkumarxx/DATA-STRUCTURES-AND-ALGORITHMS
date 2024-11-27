package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence
{

    private int getLCS(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        int max=0;
        for(int i=0;i<n2;++i)
        {
            int indOne=i;
            int indTwo=0;
            int count=0;
            while (indOne<n2 && indTwo<n1)
            {
                if(s2.charAt(indOne)==s1.charAt(indTwo))
                {
                    ++count;
                    ++indOne;
                    ++indTwo;
                }
                else ++indOne;
            }
            if(count>max)
                max=count;
        }
        return max;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence obj=new LongestCommonSubsequence();
        System.out.println(obj.getLCS("ABCDGH","AEDFHR"));
    }

}
