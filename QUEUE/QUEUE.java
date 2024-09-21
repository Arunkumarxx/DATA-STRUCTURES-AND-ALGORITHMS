package QUEUE;
public class QUEUE {
    static StringBuilder res =new StringBuilder();
    public static void main(String[] args) {
        int n=10;
        QUEUE q =new QUEUE();
        q.recursive(n);
        System.out.println(res);
    }
    private void recursive(int n)
    {
        if(n==0) {
            res.append(0);
            return;
        }
        if(n==1)
        {
            res.append(1);
            return;
        }
        recursive(n/2);
        res.append(n%2);
    }
}
