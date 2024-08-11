package STRING;

public class PanagramChecking {

    public static void main(String[] args) {

        String str="Bawds jog, flick quartz, vex nymph";
        System.out.println(checkPangram(str));
    }
    public static boolean checkPangram  (String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ++freq[s.charAt(i) - 'a'];
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ++freq[Character.toLowerCase(s.charAt(i)) - 'a'];
            }
        }
        for(int x:freq)
            if(x==0)
                return false;
        return true;
    }
}
