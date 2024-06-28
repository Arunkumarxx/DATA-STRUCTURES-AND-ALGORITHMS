package ARRAYS;
public class WaveArray {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        int n= arr.length;
        for (int i=1;  i<n; i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for (int x:arr) System.out.print(x);
    }
}
