package ARRAYS;
public class LeftRotateAnArrayByDPlaces {
    static void swap(int arr[],int start,int end) {
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6};
        int n = arr.length;
        int d = 8;
        d%=n;
        //6,5,4,3,2,1
        swap(arr, 0, n-1);
        //3,4,5,6,2,1
        swap(arr,0,n-d-1);
        //3,4,5,6,1,2
        swap(arr,n-d,n-1);
        for (int x:arr)
            System.out.print(x+" ");
    }
}
