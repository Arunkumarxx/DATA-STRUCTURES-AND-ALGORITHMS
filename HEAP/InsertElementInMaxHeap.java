package HEAP;


import java.util.Arrays;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[1000];
    private int size=heap.length;
    private int currentSize=0;

    private void insert(int value) {
        
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
