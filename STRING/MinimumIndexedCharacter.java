package STRING;

import java.io.CharArrayReader;
import java.util.HashMap;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        String str ="geeksforgeeks";
        String pattern="set";
        System.out.println(minIndexChar(str,pattern));
    }
    private static int minIndexChar(String str, String pattern)
    {
        HashMap<Character,Integer> hashMap =new HashMap<>();
        int n=str.length();
        for(int i=0; i<n; ++i)
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        System.out.println(hashMap);
    }
}
