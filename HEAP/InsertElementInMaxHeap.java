package HEAP;

import java.util.Arrays;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[1000];
    private int size=heap.length;
    private int currentSize=0;
    private int lastInsertIndex=0;
    private void insert(int value) {
        if(heap[0]==null)
        {
            heap[0]=value;
            return;
        }
        ++lastInsertIndex;
        int i=lastInsertIndex;
        if(i>=size || currentSize>=size)
            resize();
        heap[i]=value;
        ++currentSize;
        while(i>0)
        {
            int parent = heap[(i-1)/2];
            int child  = heap[i];
            if(parent<child)
            {
                heap[i]=parent;
                heap[(i-1)/2]=child;
                i=(i-1)/2;
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
        for(int i=0;i<=1000;++i)
        {
            heap.insert(i);
        }
        for(Integer value: heap.heap) {
            if(value==null)
                return;
            System.out.print(value + " ");
        }

    }
}
