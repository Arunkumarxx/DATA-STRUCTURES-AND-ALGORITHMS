package ARRAYS;

class SegregateEvenAndOddNumbersUsingLomutoPartitionScheme {
static void SegregateEvenAndOddNumbersUsingLomutoPartitionScheme1(int[] arr,int n){
          int[] array = new int[n];
          int Start =0 ,End=n;
          int Start2 =0 ,End2=n;
          int count=0;
          while (Start < End){
               if (arr[Start]%2 == 0 ){
                    array[count++]=arr[Start];
               }
               Start++;
          }
          while (Start2 < End2){
               if (arr[Start2] % 2 == 1) {
                    array[count++] = arr[Start2];
               }
               Start2++;
          }
          for (int temp:array){
               System.out.print(temp+" ");
          }
     }
 static void SegregateEvenAndOddNumbersUsingLomutoPartitionScheme2(int[] arr,int n) {
     int i =0 ,j=0;
     while (j!=n){
          if (arr[j]%2 == 0){
               int temp = arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               i++;
          }
          j++;
     }
     for (int print:arr){
          System.out.print(print+" ");
     }
}
     public static void main(String[] args) {
          int[] arr = {7, 2, 9, 4, 6, 1, 3, 8, 5};
          ///          o  e  o  e  e  o  o  e  o
          //
          int n=arr.length;
          SegregateEvenAndOddNumbersUsingLomutoPartitionScheme2(arr,n);
     }
}
