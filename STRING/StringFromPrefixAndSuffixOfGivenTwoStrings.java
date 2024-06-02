package STRING;
 class StringFromPrefixAndSuffixOfGivenTwoStrings {
    static void  StringFromPrefixAndSuffixOfGivenTwoStrings(String a,String b, int l) {
        String ps="";
        if (a.length()>=l){
           ps+= a.substring(0,l);
        }
        if (b.length()>=l){
            ps+=b.substring(b.length()-l,b.length());
        }
        if (a.length()<l && b.length()<l){
            ps+=a.substring(0,l);
            ps+=b.substring(b.length()-l,b.length());
        }
        System.out.println(ps);
    }
     public static void main(String[] args) {
         String str1 ="adulation";
         //            012456
         String str2 = "obstreperous";
         //             012345678
         int l=6;
         StringFromPrefixAndSuffixOfGivenTwoStrings(str1,str2,l);
     }
}
