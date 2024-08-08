package STRING;

public class TheModifiedString {
    public static void main(String[] args) {
        String str ="aabbbcc";
        System.out.println(modified(str));
    }
    private static long modified(String str)
    {
        if(str.length()==3)
            return 1;
        int n=str.length();
        int consicutive=1;
        int modificationCount=0;
        for(int i=0; i<n-1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1))
                ++cons;
            if(cons==3) {
                ++modificationCount;
                cons
            }
        }
        return 1;
    }
}
