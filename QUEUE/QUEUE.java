package QUEUE;
public class QUEUE {

    public static void main(String[] args) {
        int n=5;
    }
    private void recursive(int n)
    {
        if(n==0)
            return;
        System.out.println(n%2);
        n=n/2;
        recursive(n/2);
    }
}
