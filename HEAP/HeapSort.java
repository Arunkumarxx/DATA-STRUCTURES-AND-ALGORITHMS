package HEAP;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    Integer[] heap =new Integer[100];
    private int currentSize=0;
    private int size=heap.length;
    private void insert(int value)
    {
        if(currentSize==0)
        {
            heap[0]=value;
            ++currentSize;
            return;
        }
        heap[currentSize]=value;
        int i=currentSize;
        ++currentSize;
        if(currentSize>=size)
            resize();
        while(i>0)
        {
            int parent=(i-1)/2;
            if(heap[parent]<heap[i])
            {
                int temp=heap[i];
                heap[i]=heap[parent];
                heap[parent]=temp;
                i=parent;
            }
            else return;
        }
    }
    private int delete()
    {
        int ele=heap[0];
        --currentSize;
        heap[0]=heap[currentSize];
        int i=0;
        while(i<currentSize)
        {
            int largest=i;
            int leftChild=2*i+1;
            int rightChild=2*i+2;

            if(leftChild<currentSize && heap[leftChild]>heap[largest])
                largest=leftChild;

            if(rightChild<currentSize && heap[rightChild]>heap[largest])
                largest=rightChild;

            if(i==largest)
                break;
            int temp=heap[i];
            heap[i]=heap[largest];
            heap[largest]=temp;
        }
        return ele;
    }
    private void resize()
    {
        Integer [] temp =new Integer[size*2];
        for(int i=0;i<size;++i)
        {
            temp[i]=heap[i];
        }
        heap=temp;
        size=heap.length;
    }
    private void print()
    {
        for(Integer val:heap)
            if(val!=null)
            System.out.print(val+" ");
        else return;
    }
    private int [] sort(int [] arr)
    {
        for(int val:arr)
            insert(val);
        int [] result =new int[arr.length];
        int i=result.length-1;
        while(currentSize>0)
        {
            result[i--]=delete();
        }
        return result;
    }
    public static void main(String[] args) {
        HeapSort heapSort =new HeapSort();
        int n=573;
        Random random =new Random();
        int [] arr = new int [n];
        for (int i=0;i<n;++i)
        {
            arr[i]=random.nextInt(0,999);
        }
       arr= heapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
