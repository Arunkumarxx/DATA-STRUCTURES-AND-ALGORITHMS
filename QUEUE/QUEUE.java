package QUEUE;
public class QUEUE {

    public static void main(String[] args) {
        int n=10;
        QUEUE q =new QUEUE();
        q.recursive(n);
    }
    private void recursive(int n)
    {
        if(n==0)
            return;
        int temp=n%2;
        n=n/2;
        recursive(n/2);
        System.out.println(temp);
    }
}
