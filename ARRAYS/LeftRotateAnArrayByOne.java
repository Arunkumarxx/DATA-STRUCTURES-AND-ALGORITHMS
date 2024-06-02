package ARRAYS;

public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int  n= arr.length-1;
        int temp=arr[0];
      for (int i=1; i<n;i++){
          arr[i-1]=arr[i];
      }
      arr[n-1]=temp;
        for (int temps:arr)
            System.out.print(temps+" ");
    }
}
