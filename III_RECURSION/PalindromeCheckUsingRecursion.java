package RECURSION;

public class PalindromeCheckUsingRecursion {
    static String PalindromeUsingRecursion (String str, int i,String res) {
        if (i<0)
            return res;

      return PalindromeUsingRecursion(str,i-1,res+str.charAt(i));
    }
    static boolean PalindromeUsingRecursion(String str,int i, int j,boolean flag){
        if (i>j||flag==false)
            return flag;

      return  PalindromeUsingRecursion(str,i+1,j-1,flag=str.charAt(i)==str.charAt(j));
    }
    public static void main(String[] args) {
        String str  = "";
        String res = PalindromeUsingRecursion(str,str.length()-1,"");
        boolean result =PalindromeUsingRecursion(str,0,str.length()-1,true);
        System.out.println(result);

    }
}