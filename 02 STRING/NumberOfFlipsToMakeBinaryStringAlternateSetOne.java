package STRING;
 class NumberOfFlipsToMakeBinaryStringAlternateSetOne {

     public static void main(String[] args) {
         String str = "1";
         int flip = 0;
         if (str.length() < 2) {
             System.out.println(flip);
         } else {
             for (int i = 0; i < str.length() - 1; i += 2) {
                 if (str.charAt(i) == str.charAt(i + 1)) {
                     flip++;
                 }
             }
             System.out.println(flip);
         }
     }
}
