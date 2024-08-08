package STRING;

public class IsSubSequence {
    public static void main(String[] args) {
        String str ="";
        String target = "";
        System.out.println(subsequence(str,target));
    }
    private static boolean subsequence (String str,String target) {
        int j=0;
        int n=str.length();
        for(int i=0; i<n;++i)
        {
            while( j<target.length() && target.charAt(j)!=str.charAt(i))
                ++j;
            if(!( j<target.length() && str.charAt(i)==target.charAt(j) ))
                return false;
        }
        return true;
    }
}
