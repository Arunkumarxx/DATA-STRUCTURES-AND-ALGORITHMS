package HEAP;

import java.util.Arrays;

public class SortKSortedArray {
    Integer[] heap=new Integer[100];
    private int size=0;

    private void insert(int value) {
        if(size==heap.length)
            resize();
        heap[size]=value;
        ++size;
        int i=size-1;
        while(i>0) {
            int parent=(i-1)/2;
            if(heap[parent]>heap[i]) {
                int temp=heap[parent];
                heap[parent]=heap[i];
                heap[i]=temp;
                i=parent;
            } else return;
        }
    }

    private int extractMin() {
        int min=heap[0];
        heap[0]=heap[size-1];
        heap[size-1]=null;
        --size;
        int i=0;
        while(true) {
            int smallest=i;
            int leftChild=2*i+1;
            int rightChild=2*i+2;
            if(leftChild<size&&heap[leftChild]<heap[smallest])
                smallest=leftChild;
            if(rightChild<size&&heap[rightChild]<heap[smallest])
                smallest=rightChild;
            if(smallest==i)
                break;
            int temp=heap[i];
            heap[i]=heap[smallest];
            heap[smallest]=temp;
            i=smallest;
        }
        return min;
    }

    private void resize() {
        Integer[] temp=new Integer[heap.length*2];
        System.arraycopy(heap,0,temp,0,heap.length);
        heap=temp;
    }

    private boolean isEmpty() {
        return size==0;
    }

    public void nearlySorted(int[] arr,int k) {
        int n=arr.length;
        for(int i=0;i<=k;++i) {
            insert(arr[i]);
        }
        int ind=0;
        for(int i=k+1;i<n;++i) {
            arr[ind++]=extractMin();
            insert(arr[i]);
        }
        while(!isEmpty()) {
            arr[ind++]=extractMin();
        }
    }

    public static void main(String[] args) {
        SortKSortedArray sorter=new SortKSortedArray();
        int[] arr1={6,5,3,2,8,10,9};
        int k1=3;
        System.out.println("Original array: "+Arrays.toString(arr1));
        sorter.nearlySorted(arr1,k1);
        System.out.println("Sorted array: "+Arrays.toString(arr1));
    }
}
