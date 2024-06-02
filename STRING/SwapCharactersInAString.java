package STRING;
 class SwapCharactersInAString {
   static void   SwapCharactersInAString1(String str,int b,int c) {
       char [] arr =str.toCharArray();
       int n= arr.length;
       c=c%n;
       for (int i=0; i<b; i++){
           for (int j=0;j<n; j++){
               swap(arr,j,(j+c)%n);
           }
       }
       for (int i =0; i<arr.length; i++){
           System.out.print(arr[i]+"");
       }
     }
     static void swap(char[]arr,int x,int y) {
       char temp=arr[x];
       arr[x]=arr[y];
       arr[y]=temp;
     }
     public static void main(String[] args) {
       String str="ABCDEFGHIJK";
       int b=1000;
       int c=3;
       SwapCharactersInAString1(str,b,c);
     }
}
/*
for (int j=0; j<str.length();j++){

         }
 */