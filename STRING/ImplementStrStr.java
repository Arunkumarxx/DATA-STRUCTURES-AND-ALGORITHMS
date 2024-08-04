package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String str="GeeksForGeeks";
        String key="Fr";
        System.out.println(Str(str,key));
    }
    private static int Str(String str,String key) {
        int kn=key.length();
        int sn=str.length();
        int ind=0;
        for (int i=0; i<kn-1; ++i)
        {
            for(int j=0; j<sn-1; ++j) {
                if(i==0 && str.charAt(j)==key.charAt(i))
                    ind=j;
                if (!(str.charAt(j) == key.charAt(i) && key.charAt(i + 1) == str.charAt(j + 1)))
                    return -1;

            }
        }

        return ind;
    }
}
