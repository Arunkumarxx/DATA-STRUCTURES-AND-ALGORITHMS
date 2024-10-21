package HEAP;

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
        while(i>=0)
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
        if(currentSize<=0)
            return -1;
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
        }
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
    private void sort(int [] arr)
    {
        for(int val:arr)
            insert(val);
    }
    public static void main(String[] args) {
        HeapSort heapSort =new HeapSort();
        int [] arr ={5,4,3,2,1};
        heapSort.sort(arr);
    }

}
