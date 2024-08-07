package STRING;

import java.util.HashMap;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String str="arunkumar";
        System.out.println(repeatedCharacter(str));
    }
    static int repeatedCharacter(String Str)
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int n=Str.length();
        for(int i=0; i<n;++i)
            hashMap.put(Str.charAt(i),hashMap.getOrDefault(Str.charAt(i),0)+1);
        for(int i=0; i<n; ++i)
            if(hashMap.get(Str.charAt(i))>1)
                return i;
        return -1;
    }

}
