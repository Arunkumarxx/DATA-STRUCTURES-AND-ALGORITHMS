package STRING;

public class KeyPadTyping {
    public static void main(String[] args) {
        String str ="geeksquiz";
        int n=str.length();
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0; i<n; ++i)
        {
           stringBuilder.append( printNumber(str.charAt(i)));
        }
        System.out.println(stringBuilder.toString());
    }
    private static char printNumber(char s)
    {
        switch (s)
        {
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return '9';
        }
        return ' ';
    }
}
