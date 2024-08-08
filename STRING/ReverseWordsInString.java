package STRING;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.CheckedOutputStream;

public class ReverseWordsInString {
    public static void main(String[] args) throws IOException {
        OutputStream console =System.out;
        console.write(reverseWords("i.like.this.program.very.much").getBytes());
        console.flush();
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
