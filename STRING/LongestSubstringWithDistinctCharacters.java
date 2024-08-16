package STRING;

import java.util.HashSet;

public class LongestSubstringWithDistinctCharacters {

    public static void main(String[] args) {
        String str= "abcdasdc";
        System.out.println(LongestSubString(str));
    }
    private static String LongestSubString(String str) {

        HashSet<Character> hashSet =new HashSet<>();
        int i=0 ,j =0 ,n =str.length();
        int max=0;
        int start=0;
        int end=0;
        while(j<n)
        {
            if(!hashSet.contains(str.charAt(j)))
            {
                hashSet.add(str.charAt(j));
                ++j;
                if(j-i>max)
                {
                    start=i;
                    end=j;
                    max=j-i;
                }
            }
            else  {
                hashSet.remove(str.charAt(i));
                ++i;
            }
        }
        return str.substring(start,end);
    }
}
