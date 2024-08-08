package STRING;

import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
     private static String reverseWords(String S)
    {
        // code here
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0; i<S.length(); ++i)
        {
            if(S.charAt(i)!='.')
                word.append(S.charAt(i));
            else {
                result.insert(0,word);
                result.insert(0,'.');
                word.setLength(0);
            }
        }
        if(word.length()>0)
            result.insert(0,word);
        return result.toString();
    }
}
