package STRING;

import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder("i.like.this.program.very.much");
        ArrayList<ArrayList<StringBuilder>> arrayList =new ArrayList<>();
        int n=stringBuilder.length();
        StringBuilder temp =new StringBuilder();
        int k=0;
        for(int i=0; i<n; ++i)
        {
            if(stringBuilder.charAt(i)!='.')
                temp.append(stringBuilder.charAt(i));
            if(stringBuilder.charAt(i)=='.') {
                arrayList.add(new ArrayList<>());
                arrayList.get(k).add(temp);
                temp=new StringBuilder();
                ++k;
            }
        }
        if (temp.length() > 0) {
            arrayList.add(new ArrayList<>());
            arrayList.get(k).add(temp);
        }
        System.out.println(arrayList);
    }
}
