package STRING;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String string1 = "aacdb";
        String string2 = "gafd";
        System.out.println(concatenatedString(string1,string2));
    }
    private static String concatenatedString(String s1,String s2)
    {
        HashSet<String> hashSet1 =new HashSet<>();
        HashSet<String > hashSet2=new HashSet<>();
        for(int i=0; i<s1.length(); ++i)
            hashSet1.add(String.valueOf(s1.charAt(i)));

        for(int i=0; i<s2.length(); ++i)
            hashSet2.add(String.valueOf(s2.charAt(i)));

        Iterator<String> iterator = hashSet1.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (hashSet2.contains(element)) {
                hashSet2.remove(element);
                Iterator<String> iterator2 = hashSet2.iterator();
                while(iterator2.hasNext())
                    hashSet2.remove(element.li);
            }
        }

        System.out.println(hashSet1);
        System.out.println(hashSet2);
       return "";
    }
}
