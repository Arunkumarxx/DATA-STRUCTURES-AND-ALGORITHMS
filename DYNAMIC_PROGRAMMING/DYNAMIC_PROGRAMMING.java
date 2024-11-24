package DYNAMIC_PROGRAMMING;

public class DYNAMIC_PROGRAMMING {

    public static void main(String[] args)
    {
        int i=0;
        int j=1;
        int n=34;

        while(j <n)
        {
            System.out.println(i+" "+j);
            System.out.print(" "+(i+j));
            int temp=i;
            i=j;
            j=temp+j;
        }
    }

}
