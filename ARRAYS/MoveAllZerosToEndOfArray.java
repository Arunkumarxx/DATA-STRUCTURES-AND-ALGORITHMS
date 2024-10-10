package ARRAYS;

class MoveAllZerosToEndOfArray {
     static void MoveAllZerosToEndOfArray1(int[] arr) {
       // push Zero to end of the array
          int n  = arr.length;
          int count =0;
           for (int i =0; i<n; i++){
                if (arr[i] != 0) {
                     arr[count++]=arr[i];// counted increment by one after recall
                }
           }
           while (count <n){
                arr[count++]=0;
           }
     }
     static void MoveAllZerosTOEndOfArray2(int[] arr) {
          int n= arr.length;
          int count=0;
          for (int i =0; i<n; i++){
               if (arr[i]!= 0 ){
                    int temp = arr[count];
                    arr[count++]=arr[i];
                    arr[i]=temp;
               }
          }
     }
     static void print(int[]arr) {
          System.out.print("{");
          for (int temp :arr) {
               System.out.print(temp+" ");
          }
          System.out.print("}");
     }
     public static void main(String[] args) {
          int[] arr ={1,2,0,0,0,3,6};
          //          0 1 2 3 4 5 6
          MoveAllZerosToEndOfArray1(arr);
          print(arr);
          System.out.println("\n");
          MoveAllZerosTOEndOfArray2(arr);
          print(arr);
     }
}
