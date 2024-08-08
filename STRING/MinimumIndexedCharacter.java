package STRING;

import java.util.HashSet;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        String str ="arun";
        String pattern="uu";
        System.out.println(minIndexChar(str,pattern));
    }
    private static int minIndexChar(String str, String pattern)
    {
        HashSet<Character> hashSet =new HashSet<>();
        for(int i=0; i<pattern.length(); ++i)
            hashSet.add(pattern.charAt(i));
        for(int i=0; i<str.length(); ++i)
        {
            if(hashSet.contains(str.charAt(i)))
                return i;
        }
        return -1;
    }
}
