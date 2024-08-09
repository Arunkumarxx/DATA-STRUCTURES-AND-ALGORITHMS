package STRING;

import static javax.swing.text.html.HTML.Tag.BASE;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {
        String str= "aabbccddeeddff";
        String pattern = "ab";
        long times=System.currentTimeMillis();
        System.out.println(RabinKarp_PatternSearching(str,pattern));
        long timee=System.currentTimeMillis();
        System.out.println(timee-times);
    }
    private static  boolean RabinKarp_PatternSearching(String str,String pattern) {
        int n1=str.length();
        int n2=pattern.length();

        if(n2>n1)
            return false;
        int stringHash=HashValue(str.substring(0,n2));
        int patterHash=HashValue(pattern);

        for(int i=0; i<=n1-n2; ++i)
        {
            if(stringHash==patterHash && str.charAt(i)==pattern.charAt(0)) {
                boolean isPatternFound = true;
                for (int j = 0; j < n2; ++j) {
                    if (str.charAt(i + j) != pattern.charAt(j)) {
                        isPatternFound = false;
                        break;
                    }
                }
                if (isPatternFound)
                    return true;
            }
           if(i<n1-n2)
        {
            stringHash-=(str.charAt(i)-'a'+1);
            stringHash+=(str.charAt(i+n2)-'a'+1);
        }
    }
        return false;
    }
    private static int HashValue(String str) {
        int hash=0;
        for(char x:str.toCharArray())
            hash+=(x-'a'+1);
        return hash;
    }

}
