package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String str="GeeksForGeeks";
        String key="For";
        System.out.println(Str(str,key));
    }
    private static int Str(String str,String searchKey) {
       int ind=-1;
       int n=str.length();
       char start=searchKey.charAt(0);
       char end=searchKey.charAt(searchKey.length()-1);
       int startInd=-1;
       int endInd=-1;
       for (int i=0; i<n && (startInd<0|| endInd<0); ++i)
       {
           if(str.charAt(i)==start) startInd=i;
           if(str.charAt(i)==end)   endInd=i;
       }
       for (int i=startInd; i<=endInd;++i)
       {
           
       }
       return -1;
    }
}
