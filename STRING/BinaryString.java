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
           if(str.charAt(s)=='0') {
               ++s;
               continue;
           }
          else {
              count+=2;
              --e;
           }
        }
        return count;
    }
}
