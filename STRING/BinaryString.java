package STRING;

public class BinaryString {
    public static void main(String[] args) {
        String str="01101";
        System.out.println(BinaryString(str.length(),str));
    }
    private static int  BinaryString (int n,String str) {
        int count=0;
        for(int i=0 ;i<n; ++i)
            if(str.charAt(i)=='1')
                ++count;
        return count*(count-1)/2;
    }
}
