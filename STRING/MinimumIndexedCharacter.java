package STRING;

import java.io.CharArrayReader;
import java.util.HashMap;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        String str ="arun";
        String pattern="u";
        System.out.println(minIndexChar(str,pattern));
    }
    private static int minIndexChar(String str, String pattern)
    {
        HashMap<Character,Integer> hashMap =new HashMap<>();
        for(int i=0; i<pattern.length(); ++i)
            hashMap.put(pattern.charAt(i),hashMap.getOrDefault(pattern.charAt(i),0)+1);
        for(int i=0; i<str.length(); ++i)
        {
            if(hashMap.containsKey(str.charAt(i)))
                return i;
        }
        return -1;
    }
}
