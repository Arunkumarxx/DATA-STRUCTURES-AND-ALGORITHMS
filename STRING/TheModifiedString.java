package STRING;

public class TheModifiedString {
    public static void main(String[] args) {
        String str ="abc";
        System.out.println(modified(str));
    }
    private static long modified(String str)
    {
        int n=str.length();
        int consecutive=1;
        int modificationCount=0;
        for(int i=0; i<n-1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1))
                ++consecutive;
            else consecutive=1;
            if(consecutive==3) {
                ++modificationCount;
                consecutive=1;
            }
        }
        return modificationCount;
    }
}
