package STRING;

class CheckIfStringIsSubstringOfAnother {
    static int  CheckIfStringIsSubstringOfAnother1(String s1,String s2) {
        String str1=s1;
        String str2 =s2;
        int str1Len = s1.length();
        int str2Len = s2.length();
        for (int i=0; i<=str2Len-str1Len;i++){
            int j;
            for (j=0; j<str1Len;j++){
                if (str1.charAt(j)!=str2.charAt(i+j)){
                    break;
                }
            }
            if (j==str1Len) {
                return i;
            }
        }
        return -1;

    }
     public static void main(String[] args) {
         String s1 = "for";
         //           012
         String s2 = "geeksforgeeks";
         //           0123456789012
       int res=  CheckIfStringIsSubstringOfAnother1(s1,s2);
       if (res==-1)
           System.out.println("Not present");

       else
           System.out.println("Present at index :"+res);

     }
}
