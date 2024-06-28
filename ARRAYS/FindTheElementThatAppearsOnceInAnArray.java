package ARRAYS;

class FindTheElementThatAppearsOnceInAnArray {
     static void FindTheElementThatAppearsOnceInArray1(int[] arr,int n) {
          int onceIndex=-1;
          for (int i =0; i<n; i++){
               int count=0;
               for (int j=0 ;j<n;j++){
                    if (arr[i]==arr[j]){
                         count++;
                         onceIndex=arr[i];
                    }
               }
               if (count == 1 ){

                    System.out.print(onceIndex+" ");
               }
          }
     }
    static void  FindTheElementThatAppearsOnceInArray2(int[] arr,int n) {
// XOR can be used if we needed find element that appear once in array
         int XOResult=0;
         for (int i =0; i<n-1; i++){
              XOResult ^=arr[i];
         }
         System.out.println(XOResult);
     }
     public static void main(String[] args) {
          int [] arr = {110,3,5,4,5,3,4,230};
          int n= arr.length;
          FindTheElementThatAppearsOnceInArray2(arr,n);

     }
}
