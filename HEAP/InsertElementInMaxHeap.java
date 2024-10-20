package HEAP;

import java.util.Arrays;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[1000];
    private int size=heap.length;
    private int currentSize=0;
    private int lastInsertIndex=0;
    private void insert(int value) {
        if(currentSize==0)
        {
            heap[0]=value;
            ++currentSize;
            ++lastInsertIndex;
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
            int parent= (i-1)/2;
            if(heap[parent]<heap[i])
            {
                int temp=heap[parent];
                heap[parent]=heap[i];
                heap[i]=temp;
                i=parent;
            }
            else return;
        }
    }
    private void resize() {
        Integer[] temp = new Integer[size * 2];
        System.arraycopy(heap, 0, temp, 0, currentSize);
        heap = temp;
        size = heap.length;
    }
    public static void main(String[] args) {
        InsertElementInMaxHeap heap =new InsertElementInMaxHeap();
        for(int i=0;i<=100;++i)
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
