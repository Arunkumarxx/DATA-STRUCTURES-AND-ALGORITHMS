package STRING;

import java.util.HashMap;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String str="arunu";
        System.out.println(repeatedCharacter(str));
    }
    private static int repeatedCharacter(String Str)
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int n=Str.length();
        for(int i=0; i<n;++i) {
            if(hashMap.containsKey(Str.charAt(i)))
                return hashMap.get(Str.charAt(i));
                else hashMap.put(Str.charAt(i),hashMap.getOrDefault(Str.charAt(i),0)+1);

        }
        return -1;

    }
}
