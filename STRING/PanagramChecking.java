package STRING;

public class PanagramChecking {

    public static void main(String[] args) {

        String str="Aawds jog, flick quartz, vex nymph";
        System.out.println(checkPangram(str));
    }
    public static boolean checkPangram  (String s) {
        int[] ALPHABET = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ++ALPHABET[s.charAt(i) - 'a'];
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ++ALPHABET[Character.toLowerCase(s.charAt(i)) - 'a'];
            }
        }
        for(int x:ALPHABET)
            if(x==0)
                return false;
        return true;
    }
}
