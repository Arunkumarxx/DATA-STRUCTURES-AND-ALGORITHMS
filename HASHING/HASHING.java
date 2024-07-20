package HASHING;

public class HASHING {
    public static void main(String[] args) {
        int n=10;
        String str= Integer.toString(n);
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(!(str.charAt(start)==str.charAt(end)))
                return "No";
            ++start;
            --end;
        }
        return "Yes";
    }
}
