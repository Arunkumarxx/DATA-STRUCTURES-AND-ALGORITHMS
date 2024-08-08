package STRING;

public class IsSubSequence {
    public static void main(String[] args) {
        String str ="ace";
        String target = "abcde";
        System.out.println(subsequence(str,target));
    }
    private static boolean subsequence (String str,String target) {
        int i=0;
        int j=0;
        while(i<str.length() && j<target.length())
        {
            if(str.charAt(i)==target.charAt(i))
                ++i;
            j++;
        }
        return i==str.length();
    }
}
