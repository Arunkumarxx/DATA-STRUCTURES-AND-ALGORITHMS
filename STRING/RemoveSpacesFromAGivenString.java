package STRING;
import java.io.StringReader;

class RemoveSpacesFromAGivenString {
   static void  RemoveSpacesFromAGivenString1(String str) {

       int index=0;
       int co;
       char [] temp  =str.toCharArray();
       int n=str.length();
       for (int i =0; i<n; i++){
           if (temp[i]!=' '){
               temp[index]=temp[i];
               index++;
           }
       }
       String str2 = new String(temp,0,index);
       System.out.println(str2);
    }
   static int   RemoveSpacesFromAGivenString2(char[] str) {
       int index=0;
       for (int i =0; i<str.length; i++){
           if (str[i]!=' '){
               str[index++]=str[i];
           }
       }
       return index;
    }
     public static void main(String[] args) {
        String str1 = "geeks for geeks";
        RemoveSpacesFromAGivenString1(str1);
        char str[] = str1.toCharArray();
        int index = RemoveSpacesFromAGivenString2(str);
         System.out.println(String.valueOf(str).subSequence(0,index));
         str1= str1.replaceAll("\\s","");
         System.out.println(str1);
     }
}
