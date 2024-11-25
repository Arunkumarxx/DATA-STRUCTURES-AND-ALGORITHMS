package DYNAMIC_PROGRAMMING;


public class WaysToWriteNAsSum
{
    int countWays(int n)
    {
        int table[]=new int[n+1];
        int mod=1000000007;

        for(int i=0;i<=n;i++)
        {
            table[i]=0;
        }

        table[0]=1;

        for(int i=1;i<n;i++)
            for(int j=i;j<=n;j++)
                table[j]=(table[j]%mod+table[j-i]%mod)%mod;
        return table[n]%mod;
    }

    public static void main(String[] args)
    {
        WaysToWriteNAsSum obj=new WaysToWriteNAsSum();
        int n=5;
        System.out.println("Number of ways to write "+n+" as sum: "+obj.countWays(n));
    }
}
