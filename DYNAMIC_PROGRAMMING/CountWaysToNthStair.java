package DYNAMIC_PROGRAMMING;

public class CountWaysToNthStair
{
    private Long countWays(int n) {
        return (long)(n/2) +1L;
    }
    public static void main(String[] args)
    {
        CountWaysToNthStair obj =new CountWaysToNthStair();
        System.out.println(obj.countWays(1-));
    }
}
