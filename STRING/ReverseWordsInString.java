package STRING;

import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder("arun kumar");
        ArrayList<ArrayList<String>> arrayList =new ArrayList<>();
        int n=stringBuilder.length();
        StringBuilder temp =new StringBuilder();
        int k=0;
        for(int i=0; i<n; ++i)
        {
            if(stringBuilder.charAt(i)!=' ')
                temp.append(stringBuilder.charAt(i));
            if(stringBuilder.charAt(i)==' ') {
                arrayList.add(k,new ArrayList<>());
                String str=temp.toString();
                arrayList.add(k, str);
            }
        }

    }
}
