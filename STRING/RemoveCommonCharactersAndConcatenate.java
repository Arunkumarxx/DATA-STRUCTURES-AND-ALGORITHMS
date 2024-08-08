package STRING;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String string1 = "aacdb";
        String string2 = "gafd";

        // Timing for the first method
        long startTime1 = System.currentTimeMillis();
        System.out.println(concatenatedString(string1, string2));
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;
        System.out.println("Time taken for concatenatedString(string1, string2): " + duration1 + " milliseconds");

        // Timing for the second method (assuming this method exists)
        long startTime2 = System.currentTimeMillis();
        System.out.println(concatenatedString(string1, string2, 1));
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println("Time taken for concatenatedString(string1, string2, 1): " + duration2 + " milliseconds");

    }
    private static String concatenatedString(String s1,String s2)
    {
        String ans = "";
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(s2.indexOf(ch)==-1)
                ans+=ch;
        }
        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(s1.indexOf(ch)==-1)
                ans+=ch;
        }
        return ans==""?"-1":ans;
    }
    public static String concatenatedString(String s1,String s2,int n)
    {
        // Your code here
        HashSet<String> hashSet1 =new HashSet<>();
        HashSet<String > hashSet2=new HashSet<>();
        for(int i=0; i<s1.length(); ++i)
            hashSet1.add(String.valueOf(s1.charAt(i)));

        for(int i=0; i<s2.length(); ++i)
            hashSet2.add(String.valueOf(s2.charAt(i)));
        ArrayList<String> duplicates =new ArrayList<>();
        for(String ele:hashSet1)
            if(hashSet2.contains(ele)) {
                hashSet2.remove(ele);
                duplicates.add(ele);
            }
        for(String ele:duplicates)
            hashSet1.remove(ele);

        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0; i<s1.length(); ++i)
            if (hashSet1.contains(String.valueOf(s1.charAt(i))))
                stringBuilder.append(s1.charAt(i));
        for(int i=0; i<s2.length(); ++i)
            if(hashSet2.contains(String.valueOf(s2.charAt(i))))
                stringBuilder.append(String.valueOf(s2.charAt(i)));
        if(stringBuilder.length()==0) return "-1";
        return stringBuilder.toString();
    }
}
