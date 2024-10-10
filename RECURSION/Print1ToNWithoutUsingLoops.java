package RECURSION;
class Print1ToNWithoutUsingLoops {
    static void recursion(int n ){
        if (n<=0)
            return;
        recursion(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        recursion(n);
    }
}
