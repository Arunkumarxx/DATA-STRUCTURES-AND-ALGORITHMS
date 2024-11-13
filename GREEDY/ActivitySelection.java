package GREEDY;

public class ActivitySelection
{
    private int getMaximumNumberOfActivity()
    {

        return -1;
    }
    public static void main(String[] args)
    {
        ActivitySelection obj =new ActivitySelection();
         Pair [] arr ={
                 obj.new Pair(3,8),
                 obj.new Pair(2, 4),
                 obj.new Pair(1, 3),
                 obj.new Pair(10,11)
         };
    }
    class Pair
    {
        int start;
        int end;
        Pair(int start,int end )
        {
            this.start=start;
            this.end=end;
        }
    }
}
