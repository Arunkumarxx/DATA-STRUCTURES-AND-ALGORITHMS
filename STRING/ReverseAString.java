package STRING;

 class ReverseAString {
     static void ReverseString1(char[] str) {
         int l=0,r=str.length-1;
         while (l<r){
             char temp=str[l];
             str[l]=str[r];
             str[r]=temp;
             l++;
             r--;
         }
        for (int i =0; i< str.length; i++){
            System.out.print(str[i]+"");
        }
     }
     static void ReverseString2(String str) {
         StringBuilder str1 = new StringBuilder(str);
         str1.reverse();
         System.out.println(str1);
     }

     public static void main(String[] args) {
         String str = "abc";
         ReverseString2(str);
     }
}
