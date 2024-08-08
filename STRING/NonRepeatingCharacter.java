package STRING;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(nonrepeatingCharacter(str));
    }
    private static char nonrepeatingCharacter(String Str)
    {
        HashMap<Character,Integer> hashMap =new HashMap<>();
        int n=Str.length();
        for(int i=0; i<n; ++i)
            hashMap.put(Str.charAt(i),hashMap.getOrDefault(Str.charAt(i),0)+1);
        for(int i=0; i<n; ++i)
         if(hashMap.get(Str.charAt(i))==0)
               return Str.charAt(i);
        return '$';
    }
}


/*
Non Repeating Character
Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Note : When you return '$' driver code will output -1.

Examples:

Input:
s = hello
Output: h
Explanation: In the given string, the first character which is non-repeating is h, as it appears first and there is no other 'h' in the string.
Input:
s = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is the character which is non-repeating.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Number of distinct characters).
 */