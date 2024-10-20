package HEAP;

import MATRIX.InterchangingTheRowsOfAMatrix;

import java.util.Arrays;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[1000];
    private int size=heap.length;
    private int currentSize=0;

    private void insert(int value) {

        int i = 0;
        while (i < size) {
            if(currentSize==size)
                resize();
            if (heap[i] == null) {
                heap[i] = value;
                ++currentSize;
                return;
            }
            if(value<heap[i])
                i=2*i+1;
            else if(value>heap[i])
                i=2*i+2;
            else return;
            if (i >= size)
                resize();
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
