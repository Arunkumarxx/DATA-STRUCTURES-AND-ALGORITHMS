package STRING;

import java.util.ArrayList;
import java.util.Collections;

public class CaseSpecificSortingOfStrings {
    public static void main(String[] args) {
        String str="GdCaBgfR";
        ArrayList<Character> arrayList =new ArrayList<>();
        for(int i=0; i<str.length(); ++i) {
            arrayList.add(str.charAt(i)<97? (char) ( str.charAt(i) + 32) :str.charAt(i));
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
