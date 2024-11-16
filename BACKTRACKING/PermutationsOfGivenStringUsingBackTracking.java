package BACKTRACKING;

public class PermutationsOfGivenStringUsingBackTracking
{
    HashSet<String> hashSet =new HashSet<String>();
    private void permutations(String str1, StringBuilder str2)
    {
        if(str1.length()==0)
        {
            hashSet.add(str2.toString());
            return;
        }
        // backTracking
        for(int i=0;i<str1.length();++i)
        {
            char curr = str1.charAt(i);

            str2.append(curr);
            String newStr1 = str1.substring(0, i) + str1.substring(i + 1);

            permutations(newStr1, str2);

            str2.deleteCharAt(str2.length() - 1);
        }
    }

    public List<String> findPermutation(String s) {
        permutations(s,new StringBuilder());
        ArrayList<String> result =new ArrayList(hashSet);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args)
    {
        String str ="ABC";
        PermutationsOfGivenStringUsingBackTracking permutations =new PermutationsOfGivenStringUsingBackTracking();
        permutations.recursion(str,"");
    }

}
