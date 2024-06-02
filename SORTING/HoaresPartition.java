package SORTING;


public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9,7,5,14,2,3,6,10};//
        int n = arr.length;
        QuickSort(arr, 0, n-1 );
        for (int temp : arr)
            System.out.print(temp + " ");
    }
    static void swap(int arr[] ,int x,int j) {
        int temp=arr[x];
        arr[x]=arr[j];
        arr[j]=temp;
    }
    static void QuickSort(int[] arr,int l,int r) {
        if(l<r) {
            int i = l;
            int j = r;
            int pivot = arr[l];
            while (i < j) {
                i++;
                while (i <= r && arr[i] < pivot)
                    i++;
                while (j >= l && arr[j] > pivot)
                    j--;
                if (i < j && i <= r)
                    swap(arr, i, j);

            }
            swap(arr, l, j);
            QuickSort(arr, l, j - 1);
            QuickSort(arr, j + 1, r);
        }
    }
}