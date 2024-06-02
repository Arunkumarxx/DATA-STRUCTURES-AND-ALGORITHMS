package RECURSION;

class RecursiveFunctionToCheckIfAStringIsPalindrome {
    static boolean CheckPalindromeUsingRecursion(String str,int s,int e) {
        boolean res =true;
        if (s==str.length()||e==0 ||res==false) {
            return res;
        }
        if (str.charAt(s)==str.charAt(e)){
            res=true;
        }
        else {
           return res = false;
        }
       return CheckPalindromeUsingRecursion(str,s+1,e-1);
    }
    public static void main(String[] args) {
        System.out.println();
        String str = "f";
        boolean ans= CheckPalindromeUsingRecursion(str,0,str.length()-1);
        System.out.println(ans?"Output : Yes \nReverse of "+str+" is also "+str+".":"Output : No \nReverse of "+str+" not "+str+".");
        System.out.println();
    }
}
