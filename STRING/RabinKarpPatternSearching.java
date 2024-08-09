package STRING;

import static javax.swing.text.html.HTML.Tag.BASE;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {
        String str= "aaaaaaaaaaaaa";
        String pattern = "aaa";
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
       int stringHash=(str.substring(0,n2)).hashCode();
       int patterHash=(pattern).hashCode();
//        System.out.println(stringHash);
//        System.out.println(patterHash);

        for(int i=0; i<=n1-n2; ++i)
        {
            if(stringHash==patterHash && str.charAt(i)==pattern.charAt(0) )
                return true;
            if(i<n1-n2)
            {
                stringHash-=String.valueOf(str.charAt(i)).hashCode();

                stringHash+=(String.valueOf(str.charAt(i+n2)).hashCode());
            }
        }
        return false;
    }

}
