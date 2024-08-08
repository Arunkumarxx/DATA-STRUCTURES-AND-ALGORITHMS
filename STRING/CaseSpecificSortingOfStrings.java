package STRING;

import java.util.ArrayList;
import java.util.Collections;

public class CaseSpecificSortingOfStrings {
    public static void main(String[] args) {
        String str="aBzLkPq";
        ArrayList<Character> arrayList =new ArrayList<>();
        for(int i=0; i<str.length(); ++i)
            arrayList.add(str.charAt(i));
        Collections.sort(arrayList);
    }
}
