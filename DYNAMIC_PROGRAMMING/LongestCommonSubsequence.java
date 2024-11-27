package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence
{

    private int getLCS(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        int max=0;
        for(int i=0;i<n1;++i)
        {
            for(int j=0;j<n2;++j)
            {
                int count=0;
                int x=i;
                int y=j;
                while(x<n1 && y<n2 )
                {
                    if(s1.charAt(x)==s2.charAt(y))
                    {
                        
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence obj=new LongestCommonSubsequence();
        System.out.println(obj.getLCS("ABCDGH","AEDFHR"));
    }

}
