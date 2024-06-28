package RECURSION;
public class GenerateSubsetsUsingRecursion {
    static void RecursionSubsequence(String str,String ans){
        if (str=="") {
            System.out.print(ans+" ");
            return;
        }
        RecursionSubsequence(str.substring(1),ans+str.charAt(0)+"");
        RecursionSubsequence(str.substring(1),ans);
    }
    public static void main(String[] args) {
        String str = "ABC";

        RecursionSubsequence(str,"");
    }
}