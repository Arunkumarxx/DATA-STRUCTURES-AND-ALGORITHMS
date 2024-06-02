package SORTING;

public class InsertionSort {

    static void insert(int []arr,int n) {
        for (int i=1; i<n;i++)
        {
            int insertKey=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>insertKey)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=insertKey;
        }
    }
    public static void main(String[] args) {
        int [] arr ={3,432,1,23};
        insert(arr, arr.length);
        for (int x:arr) System.out.print(x+" ");

    }
}
