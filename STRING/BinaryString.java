package STRING;

public class BinaryString {
    public static void main(String[] args) {
        String str="1111";
        System.out.println(BinaryString(str.length(),str));
    }
    private static int  BinaryString (int n,String str) {
        short count=0;
        for(int i=0; i<n; ++i)
            if(str.charAt(i)=='1') ++count;
        return count;
    }
}
