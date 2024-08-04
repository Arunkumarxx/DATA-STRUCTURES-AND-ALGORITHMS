package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String str="GeeksForGeeks";
        String key="";
        System.out.println(Str(str,key));
    }
    private static int Str(String str,String searchKey) {
        int n1=str.length();
        int n2=searchKey.length();
        int ind=-1;
        boolean isFound=true;
        for (int i=0; i<n1; ++i)
        {
            if(str.charAt(i)==searchKey.charAt(0))
            {
                for(int j=0;j<n2; ++j)
                {
                    if(str.charAt(i+j)!=searchKey.charAt(j))
                    {
                        isFound=false;
                        break;
                    }
                }
                ind=i;
            }
            if(!(isFound))
                return -1;
        }
        return ind;
    }
}
