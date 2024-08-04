package STRING;

public class ImplementStrStr {
    public static void main(String[] args) {
        String str="GeeksFrrGeeks";
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

       int i=0,j=str.length()-1;
       while(i<j && (startInd<0|| endInd<0))
       {
           if(str.charAt(i)==start)
               startInd=i;
           if(str.charAt(j)==end)
               endInd=j;
           ++i;
           --j;
       }
       if(i==j) if(str.charAt(i)==start) startInd=i;

       if((endInd-startInd+1)!=searchKey.length() ||( startInd<0||endInd<0))
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
