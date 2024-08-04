package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String s="GeeksForGeeks";
        String x="Fox";
        System.out.println(Str(s,x));
    }
    private static int Str(String s,String x) {
        int ind=-1;
        boolean isValid =true;
        int i=0;
        while( i <x.length() && isValid)
        {
            boolean charFound=false;
            for(int j=0; j<s.length() && isValid; ++j) {
                if (x.charAt(i) == s.charAt(j)) {
                    if (i == 0)
                        ind = j;
                    charFound=true;
                }
            }
            if(charFound==false) return -1;
            ++i;
        }
        return ind;
    }
}
