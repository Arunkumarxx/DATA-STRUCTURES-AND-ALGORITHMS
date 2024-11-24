package DYNAMIC_PROGRAMMING;

public class DYNAMIC_PROGRAMMING {

    public static void main(String[] args)
    {
        int i=0;
        int j=1;
        int n=34;
        System.out.print("Fibonacci series: "+i+" "+j);
        while(i+j<n)
        {
            int temp=i+j;
            System.out.print(" "+temp);
            i=j;
            j=temp;
        }
    }

}
