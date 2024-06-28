package ARRAYS;
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        int start=0,end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int x:arr)
            System.out.print(x+" ");
    }
}
