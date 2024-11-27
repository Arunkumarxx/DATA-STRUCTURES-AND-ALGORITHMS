package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence
{

    private int getLCS(String s1,String s2)
    {
        // a b d a c e
        // b a b c e

        int n1=s1.length();
        int n2=s2.length();
        int max=0;
        for(int i=0;i<n2;++i)
        {
            for(int j=0;j<n1;++j)
            {
                int x=i;
                int y=j;
                int count=0;
                while(x<n2 && y<n1)
                {
                    while (x < n2 && y < n1 && s2.charAt(x) != s1.charAt(y))
                        ++y;
                    if(x<n2 && y<n1 )
                    {
                        if(s2.charAt(x)==s1.charAt(y))
                        {
                            ++count;
                            ++x;
                            ++y;
                        }
                        else ++y;
                    }
                }
                max=Math.max(count,max);
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
