package ARRAYS;

class ReversalAlgorithmForArrayRotation {
   static void  ReversalAlgorithmForArrayRotation1(int[] arr,int n,int d) {
       if (d==0){
           return;
       }
       //1 2 3 4 5 6 7
       Reverse(arr,0,n-1);
       //7 6 5 4 3 2 1
       Reverse(arr,0,n-d-1);
       //3 4 5 6 7 2 1
       Reverse(arr,n-d,n-1);

       for (int print:arr){
           System.out.print(print+" ");
       }
   }
   static void Reverse(int[] arr,int start,int  end) {
       int temp;
       while (start < end) {
            temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
   }

    public static void main(String[] args) {

       int[] arr = {1,2,3,4,5,6,7};
       int n = arr.length;
       ReversalAlgorithmForArrayRotation1(arr,n,2);

    }
}
