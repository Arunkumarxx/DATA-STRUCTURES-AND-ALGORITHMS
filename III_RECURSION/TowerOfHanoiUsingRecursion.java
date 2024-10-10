package RECURSION;
public class TowerOfHanoiUsingRecursion {
    static void count(int count){
        count++;
    }
    static int  TowerOfHanoiUsingRecursion(int  n,char A,char B,char C) {
        //                                        src,  aux  des
        if (n==1){
            System.out.println( "move disk "+n+" from "+A+" to "+C);
            return n;
        }
        int count=0;
       count+= TowerOfHanoiUsingRecursion(n-1,A,C,B);//(a)src (c)des (b)aux
//      count+=  TowerOfHanoiUsingRecursion(1,A,B,C);//(a)src (b)aux  (c)des
        System.out.println("move disk "+n+" from "+A+" to "+C);
       count+= TowerOfHanoiUsingRecursion(n-1,B,A,C);//(b)aux (a)src (c)des
        return count;
    }
    public static void main(String[] args) {
        int n=2;
        char a='1';
        char b='2';
        char c='3';
long moves=   TowerOfHanoiUsingRecursion(n,a,b,c);

        System.out.println((long)Math.pow(2,n)-1);

    }
}