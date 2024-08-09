package STRING;

import java.util.ArrayList;

public class NaivePatternSearch {
    public static void main(String[] args) {
        String str="GEEKFORGEEKS";
        String target ="aaba";
        System.out.println(search(str,target));
    }
    private static boolean search(String str, String pattern)
    {
        int n=str.length();
        ArrayList<Integer> indList =new ArrayList<>();
        for(int i=0; i<n-pattern.length(); ++i)
        {
            if(str.charAt(i)==pattern.charAt(0))
            {
                boolean coundValid=true;
                for(int j=0; j<pattern.length(); ++j)
                {
                    if(str.charAt(i+j)!=pattern.charAt(j))
                        coundValid=false;
                }
                if(coundValid) {
                    indList.add(i);
                }
            }
        }
        return true;
    }
}
