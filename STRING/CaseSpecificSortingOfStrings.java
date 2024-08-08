package STRING;

import java.util.ArrayList;
import java.util.Collections;

public class CaseSpecificSortingOfStrings {
    public static void main(String[] args) {
        
    }
    private static   String caseSort(String str)
    {
        int n=str.length();
        ArrayList<Character> lowerCase =new ArrayList<>();
        ArrayList<Character> upperCase =new ArrayList<>();
        for(int i=0; i<n;++i)
            if(str.charAt(i)>=97)lowerCase.add(str.charAt(i));
            else upperCase.add(str.charAt(i));
        Collections.sort(lowerCase);
        Collections.sort(upperCase);
        int j=0 ,k=0;
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0; i<n; ++i)
            if(str.charAt(i)<97)
                stringBuilder.append(upperCase.get(j++));
            else stringBuilder.append(lowerCase.get(k++));
        String res=stringBuilder.toString();
        return res;
    }
}
