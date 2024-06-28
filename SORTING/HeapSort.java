package SORTING;

import java.util.Arrays;

public class HeapSort {
    static void heap(int [] arr,int n) {
        for (int i=n/2-1;i>=0; i--)
            heapify(arr,n,i);

        for (int i=n-1;i>0; i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,i,0);
        }
    }
    static void heapify(int[] arr,int n,int i) {
        while (true) {
            int largest = i;
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (left < n && arr[left] > arr[largest])
                largest = left;
            if (right < n && arr[right] > arr[largest])
                largest = right;
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                i = largest;
            }else break;
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        int n= arr.length;
        heap(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
