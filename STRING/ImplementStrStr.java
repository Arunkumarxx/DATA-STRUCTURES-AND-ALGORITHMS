package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String str="GeeksForGeeks";
        String key="eeks";
        System.out.println(Str(str,key));
    }
    private static int Str(String str,String searchKey) {
       int ind=-1;
       int n=str.length();

       char start=searchKey.charAt(0);
       char end=searchKey.charAt(searchKey.length()-1);
       boolean smarked=true;
       boolean emarked=true;
       int startInd=-1;
       int endInd=-1;
       for (int i=0; i<str.length(); ++i)
       {
            if(str.charAt(i)==start && smarked) {
                startInd = i;
                smarked=false;
            }
            if(str.charAt(i)==end && emarked) {
                endInd = i;
                emarked=false;
            }
       }
       if((endInd-startInd+1)!=searchKey.length() ||( startInd<0 && endInd<0))
           return -1;

       int k=0;
       for (int m=startInd; m<=endInd;++m)
       {
           if((str.charAt(m)!=searchKey.charAt(k)))
               return -1;
           ++k;
       }
       return startInd;
    }
}
