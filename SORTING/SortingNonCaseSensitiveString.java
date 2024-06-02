package SORTING;

import java.util.HashMap;

public class SortingNonCaseSensitiveString {
    public static void main(String[] args) {
        String str="atab";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=97; i<=122; i++)
            hashMap.put((char)i,0);
        int len=str.length();
        for (int i=0; i<len; i++)
        {
            if (hashMap.containsKey(str.charAt(i)))
            {
                int x=hashMap.get(str.charAt(i));
                hashMap.put( str.charAt(i),x+1);
            }
        }
        String result="";
        for (int i=97; i<=122;)
        {
            if(hashMap.containsKey((char)i)&& hashMap.get((char)i)>0)
            {
               result+=(char)i;
               hashMap.put((char)i,hashMap.get((char)i)-1);
            }
            else  i++;
        }
        System.out.println(result);
    }
}
