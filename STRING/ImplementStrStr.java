package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String str="ArunKumar";
        String key="nKu";
        System.out.println(Str(str,key));
    }
    private static int Str(String str,String searchKey) {
        int n1=str.length();
        int n2=searchKey.length();
        for (int i=0; i<=n1-n2; ++i)
        {
            boolean isFound=true;
            if(str.charAt(i)==searchKey.charAt(0))
            {
                for(int j=0;j<n2; ++j) {
                    if (str.charAt(i + j) != searchKey.charAt(j)) {
                        isFound = false;
                        break;
                    }
                }
                if(isFound)
                    return i;
            }
        }
        return -1;
    }
}
