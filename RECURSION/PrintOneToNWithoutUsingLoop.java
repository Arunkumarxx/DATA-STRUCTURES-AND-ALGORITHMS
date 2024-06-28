package RECURSION;
public class PrintOneToNWithoutUsingLoop {
    static int call(int n,int p){
        if(n<=0){
            return 0;
        }
       return call(n/10,p)+n%10;
    }
    public static void  main(String...args)
    {
        int x=  call(1,0);
        System.out.println(x);
    }
}
