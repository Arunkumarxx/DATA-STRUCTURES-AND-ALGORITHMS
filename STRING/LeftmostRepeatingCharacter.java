package STRING;

import java.util.HashMap;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(repeatedCharacter(str));
    }
    private static boolean repeatedCharacter(String Str)
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int n=Str.length();
        for(int i=0; i<n;)
            hashMap.put(Str.charAt(i),hashMap.getOrDefault(Str.charAt(i),0)+1);
        for(int i=0; i<n; ++i)
            if(hashMap.get(Str.charAt(i))>1)
                return true;
        return false;
    }
}
