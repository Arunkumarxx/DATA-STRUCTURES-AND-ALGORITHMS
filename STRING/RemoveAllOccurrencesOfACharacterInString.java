package STRING;

class RemoveAllOccurrencesOfACharacterInString {
    static String RemoveAllOccurrencesOfACharacterInAString1(String str,char c) {
        String ans="";
       for (int i=0; i<str.length(); i++){
           if (str.charAt(i)!=c){
               ans+=str.charAt(i);
           }
       }
       return ans;
    }
    static String Remove(String str,char c) {
        StringBuilder str1=  new StringBuilder(str);
        for (int i=0; i<str1.length(); i++){
            if (c==str1.charAt(i)){
                str1.deleteCharAt(i);
                i--;
            }
        }
        return str1.toString();
    }
    static void Remove1(String str,char c) {
       str= str.replace(Character.toString(c),"");
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char c='e';
        str = RemoveAllOccurrencesOfACharacterInAString1(str,c);
        System.out.println(str);
        str= Remove(str,c);
        System.out.println(str);
        Remove1(str,c);
    }
}
