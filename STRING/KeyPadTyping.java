package STRING;

public class KeyPadTyping {
    public static void main(String[] args) {
        String str ="geeksforgeeks";
        int n=str.length();
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0; i<n; ++i)
        {
           stringBuilder.append( printNumber(str.charAt(i)));
        }
    }
    private static char printNumber(char s)
    {
        switch (s)
        {
            case s=='a':
            case s=='b':
            case s=='c':
                return '2';
                break;
        }
        return ' ';
    }
}
