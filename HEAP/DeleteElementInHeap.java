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
        int temp=heap[currentSize-1];
        heap[0]=temp;
        heap[currentSize-1]=null;
        int i=0;
        while(i!=currentSize-1)
        {

            int leftChild=2*(i+1);
            int rightChild=2*(i+2);

            if(heap[i]<heap[leftChild]) {
                swap(heap[i], heap[leftChild]);
                i=leftChild;
            }

            else if(heap[i]>heap[rightChild]) {
                swap(heap[i], heap[rightChild]);
                i=rightChild;
            }
            else return;
        }
    }
    private void swap(int parent,int child)
    {
        int temp=heap[parent];
        heap[parent]=heap[child];
        heap[child]=temp;
    }
    private void print()
    {
        for(int i=0;i<currentSize;++i)
            System.out.print(heap[i]+" ");
    }

    public static void main(String[] args) {
        DeleteElementInHeap heap = new DeleteElementInHeap();
        for(int i=0;i<=100;++i)
        {
            heap.insert(i);
        }
        heap.print();
        heap.delete();
        heap.print();
    }

}