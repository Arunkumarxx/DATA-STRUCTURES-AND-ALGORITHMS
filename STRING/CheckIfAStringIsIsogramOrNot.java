package STRING;

import java.util.HashMap;

public class CheckIfAStringIsIsogramOrNot {
    public static void main(String[] args) {
        String str="machine";
        System.out.println(IsogramOrNot( str));
    }
    private static  boolean IsogramOrNot(String  str) {
        HashMap<Character,Integer> hashMap =new HashMap<>();
        for(int i=0; i<str.length(); ++i) {
            hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0) + 1);
           if( hashMap.get(str.charAt(i))>1)
               return false;
        }
        return true;
    }
}
