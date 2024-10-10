package RECURSION;

 class ProgramForLengthOfAStringUsingRecursion {
     static int count=0;
     static int  lengthOfStringUsingRecursion(String str) {
         if (str=="")
             return 0;
         return lengthOfStringUsingRecursion(str.substring(1))+1;
     }
     public static void main(String[] args) {
         String str  ="abcd";
     int s=    lengthOfStringUsingRecursion(str);
         System.out.println(s);
     }
}
