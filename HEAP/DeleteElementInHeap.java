package HEAP;

public class DeleteElementInHeap {
    Integer [] heap  =new Integer[100];
    private  int currentSize=0;
    private int size= heap.length;

    private void resize()
    {
        Integer[] temp=new Integer[size*2];
        for(int i=0;i<size;++i)
        {
            temp[i]=heap[i];
        }
        heap=temp;
        size=heap.length;
    }

    private void insert(int value)
    {
        if(currentSize==0)
        {
            heap[0]=value;
            ++currentSize;
            return;
        }
        if(currentSize>=size)
            resize();
        int i=currentSize;
        heap[i]=value;
        ++currentSize;

        while(i>0)
        {
            int parent=(i-1)/2;
            if(heap[parent]<value)
            {
                int temp=heap[parent];
                heap[parent]=heap[i];
                heap[i]=temp;
                i=parent;
            }
            else return;
        }
    }
    private void delete()
    {
        if(currentSize==0)
            return;
        heap[0]=heap[currentSize-1];
        heap[currentSize-1]=null;
        --currentSize;
        int i=0;
        while(i<currentSize)
        {
            int leftChild=2*(i+1);
            int rightChild=2*(i+2);
            int largest=i;

            if(leftChild<currentSize && )
        }
    }
    private void swap(int parent,int largestChild)
    {
        int temp=heap[parent];
        heap[parent]=heap[largestChild];
        heap[largestChild]=temp;
    }
    private void print()
    {
        for(int i=0;i<currentSize;++i)
            System.out.print(heap[i]+" ");
    }

    public static void main(String[] args) {
        DeleteElementInHeap heap = new DeleteElementInHeap();
        for(int i=0;i<=10;++i)
        {
            heap.insert(i);
        }
        heap.print();
        heap.delete();
        System.out.println();
        heap.print();
    }

}
