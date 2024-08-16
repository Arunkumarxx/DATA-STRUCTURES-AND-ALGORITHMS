package STRING;

import java.util.HashMap;

public class SmallestWindowInAStringContainingAllTheCharactersOfAnotherString {
    public static void main(String[] args) {
        String S = "timetopractice";
        String p = "toc";
        System.out.println( smallestWindow(S,p));
    }
    private static String smallestWindow(String str, String p)
    {
        HashMap<Character,Integer> windowMap = new HashMap<>();
        HashMap<Character,Integer> patternMap =new HashMap<>();
        for(char x:p.toCharArray())
        {
            windowMap.put(x,windowMap.getOrDefault(x,0));
            patternMap.put(x, patternMap.getOrDefault(x,0)+1);
        }
        int i=0, j=0, n=str.length();
        int start=0;
        int have=0;
        int required=patternMap.size();
        int min=Integer.MAX_VALUE;
        while(j<n)
        {
            if(windowMap.containsKey(str.charAt(j)))
            {
                windowMap.put(str.charAt(j),windowMap.get(str.charAt(j))+1);
                if(windowMap.get(str.charAt(j))==patternMap.get(str.charAt(j)))
                    ++have;
            }


            while(have==required)
            {
                if(j-i+1<min)
                {
                    min=j-i+1;
                    start=i;
                }
                if(windowMap.containsKey(str.charAt(i))) {
                    windowMap.put(str.charAt(i), windowMap.get(str.charAt(i)) - 1);
                    if(windowMap.get(str.charAt(i))<patternMap.get(str.charAt(i)))
                        --have;
                }
                ++i;
            }
            ++j;
        }
        if(min==Integer.MAX_VALUE)
            return "-1";
        return  str.substring(start,start+min);
    }
}