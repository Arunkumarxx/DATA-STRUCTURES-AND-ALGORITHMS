package HEAP;


import java.util.Arrays;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[1000];
    private int size=heap.length;
    private int currentSize=0;

    private void insert(int value) {
        if(heap[0]==null)
        {
            heap[0]=value;
            return;
        }
        int i=0;
        while(i<=currentSize && heap[i]!=null)
            ++i;
        heap[i]=value;
        while(i>0)
        {
            int parent = heap[i/2];
            int child  = heap[i];
            if(parent<child)
            {
                heap[i]=parent;
                heap[i/2]=child;
                i=i/2;
            }
            else return;
        }
    }
    private void resize()
    {
        Integer [] temp =new Integer[size*2];
        temp=Arrays.copyOf(temp,0);
        heap=temp;
        size=heap.length;
    }
    public static void main(String[] args) {
        InsertElementInMaxHeap heap =new InsertElementInMaxHeap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);

    }
}
