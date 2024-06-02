package STRING;

 class GenerateAllRotationsOfAGivenString {
     static void  GenerateAllRotationsOfAGivenString1(String str) {
         int j=1;
         int n=str.length();
         String firstCopy="";
         String SecondCopy="";
       for (int i=0; i<n; i++){
           for ( j=i+1; j<n; j++ ){
               SecondCopy+=str.charAt(j);
               System.out.print(SecondCopy);
               SecondCopy="";
           }
           firstCopy+=str.charAt(i);
           System.out.println(firstCopy);

       }
     }
     public static void main(String[] args) {
         String str ="geeks";
         GenerateAllRotationsOfAGivenString1(str);
     }
}
