package STRING;

import java.util.Arrays;
import java.util.HashMap;

public class PanagramChecking {

    public static void main(String[] args) {

        String str="Aawds jog, flick quartz, vex nymph";

    }
    public static boolean checkPangram  (String s) {
        int [] ALPHABET = new int[26];
        for(int i=0; i<s.length(); ++i){
            int ind=s.charAt(i)<97?(int)s.charAt(i)+32:s.charAt(i);
            System.out.println(ind);
           }
        return false;
    }

}
