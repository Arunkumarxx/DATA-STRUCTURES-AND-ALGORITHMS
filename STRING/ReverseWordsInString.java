package STRING;

import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        String S="i.like.this.program.very.much";
        for(int i=0; i<S.length(); ++i)
        {
            if(S.charAt(i)!='.')
                word.append(S.charAt(i));
            else {
                result.insert(0,word);
                if(i!=0 &&  word.length()!=S.length())
                    result.insert(0,'.');
                word.setLength(0);
            }
        }
        System.out.println(result);
    }
}
