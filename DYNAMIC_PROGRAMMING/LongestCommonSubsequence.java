package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence
{

    private int getLCS(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();

        int max=-1;

        for(int i=0;i<n2;++i)
        {
            int count=0;
            for(int j=0;j<n1;++j)
            {
                if(s2.charAt(i)==s1.charAt(j))
                    ++count;
            }
            if(count>max)
                max=count;
        }
        return max;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence obj=new LongestCommonSubsequence();
        System.out.println(obj.getLCS("ABCDFH","AEDFHR"));
    }

}
