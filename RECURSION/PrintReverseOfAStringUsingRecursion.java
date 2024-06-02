package RECURSION;

class PrintReverseOfAStringUsingRecursion {
    static void ReverseStringUsingRecursion(String str,int n) {
        if (n==0)
            return;

        System.out.print(str.charAt(n-1));
        ReverseStringUsingRecursion(str,n-1);
    }
    public static void main(String[] args) {
        String str  ="Geeks for Geeks";
        int n=str.length();
        ReverseStringUsingRecursion(str,n);
    }
}
