package BACKTRACKING;

public class PermutationsOfGivenString
{
    private void permutations(String string)
    {
        recursion(string,"");
    }
    private void recursion(String str1,String str2)
    {
        if(str1.length()==0)
        {
            System.out.println(str2);
            return;
        }
        for(int i=0;i<str1.length();++i)
        {
            String newStr2=str1.substring(i);
            String newStr1=str1.substring(0,i-1)+str1.substring(i+1,str1.length());
            recursion(newStr1,newStr2);
        }
    }
    public static void main(String[] args)
    {
        String str ="ABC";
        PermutationsOfGivenString permutations =new PermutationsOfGivenString();
        permutations.recursion(str,"");
    }

}
