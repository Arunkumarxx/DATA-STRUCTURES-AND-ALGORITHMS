package STRING;

public class KeyPadTyping {
    static int [] charMap =new int[26];

    static {
        charMap['a'-'a']=2;
        charMap['b'-'a']=2;
        charMap['c'-'a']=2;
        charMap['d'-'a']=3;
        charMap['e'-'a']=3;
        charMap['f'-'a']=3;
        charMap['g'-'a']=4;
        charMap['h'-'a']=4;
        charMap['i'-'a']=4;
        charMap['j'-'a']=5;
        charMap['k'-'a']=5;
        charMap['l'-'a']=5;
        charMap['m'-'a']=6;
        charMap['n'-'a']=6;
        charMap['o'-'a']=6;
        charMap['p'-'a']=7;
        charMap['q'-'a']=7;
        charMap['r'-'a']=7;
        charMap['s'-'a']=7;
        charMap['t'-'a']=8;
        charMap['u'-'a']=8;
        charMap['v'-'a']=8;
        charMap['w'-'a']=9;
        charMap['x'-'a']=9;
        charMap['y'-'a']=9;
        charMap['z'-'a']=9;
    }
    public static void main(String[] args) {
        String str ="geeksquiz";
        int n=str.length();
        StringBuilder result =new StringBuilder();
         for(int i=0; i<n; ++i)
        {
            result.append(charMap[str.charAt(i)-'a']);
        }
        System.out.println(result.toString());
    }

}
