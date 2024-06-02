package ARRAYS;

class RearrangeAnArrayInMaximumMinimumFormUsingTwoPointerTechnique {
    static void RearrangeAnArrayMinMaxUsingTwoPointer1(int[] arr,int n) {
        int Start = 0 , End = n-1;
        int array[] = new int[n];
        int i =0;
       while (Start <= End) {
           if ( i%2 == 0){
               array[i++]=arr[End--];
           }
           else {
               array[i++]=arr[Start++];
           }
       }
       for (int j=0; j<n; j++){
          arr[j]=array[j];
       }
       for (int temp:arr){
           System.out.print(temp+" ");
       }
    }

    public static void main(String[] args) {

        int [] arr= {1,2,21,43,2,3,43,345};
        int n= arr.length;
        RearrangeAnArrayMinMaxUsingTwoPointer1(arr,n);

    }
}
