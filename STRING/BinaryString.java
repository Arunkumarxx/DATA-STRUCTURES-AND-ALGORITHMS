package STRING;

public class BinaryString {
    public static void main(String[] args) {
        String str=" 01101";
        System.out.println(BinaryString(str.length(),str));
    }
    private static int  BinaryString (int n,String str) {
        short count=0;
        int s=0,e=n-1;
        while(s<e)
        {
           while(str.charAt(s)=='0' && s<e)
               ++s;
           while(str.charAt(e)=='0' && e>s)
               --e;
           if(s<e)
           {
               count+=2;
               ++s;
               --e;
               System.out.println(str.substring(s,e-1));
           }
        }
        return count;
    }
}
