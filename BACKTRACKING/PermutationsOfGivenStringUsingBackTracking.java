package BACKTRACKING;

public class PermutationsOfGivenStringUsingBackTracking
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
        // backTracking
        for(int i=0;i<str1.length();++i)
        {
            char curr=str1.charAt(i);

            String  newStr2 = str2+curr;

            String newStr1 = str1.substring(0,i)+str1.substring(i+1);
            recursion(newStr1,newStr2);
        }
    }
    public static void main(String[] args)
    {
        String str ="ABC";
        PermutationsOfGivenStringUsingBackTracking permutations =new PermutationsOfGivenStringUsingBackTracking();
        permutations.recursion(str,"");
    }

}
