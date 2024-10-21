package HEAP;

import java.util.Arrays;

public class HeapSort {
    private void  buildHeap(int [] arr,int n)
    {
        for(int i=n/2;i>=0;--i)
            heapify(arr,n,i);
        for(int i=n-1;i>=0;--i)
        {
            
        }
        System.out.println(Arrays.toString(arr));
    }
    private void heapify(int [] arr,int n,int i)
    {
        while(true)
        {
            int largest=i;
            int leftChild=2*i+1;
            int rightChild=2*i+2;

            if(leftChild<n && arr[leftChild]>arr[largest])
                largest=leftChild;
            if(rightChild<n && arr[rightChild]>arr[largest])
                largest=rightChild;
            if(largest==i)
                return;
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            i=largest;
        }
    }
    public static void main(String[] args) {
        int [] arr ={4,1,3,5,6,9};
        HeapSort heapSort =new HeapSort();
        heapSort.buildHeap(arr,arr.length);
    }

}
