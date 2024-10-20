package HEAP;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[100];
    private int size=heap.length;
    private int currentSize=0;

    private void insert(int value)
    {
        if(heap[0]==null)
        {
            heap[0]= value;
            ++currentSize;
            return;
        }
        
    }
    public static void main(String[] args) {
        InsertElementInMaxHeap heap =new InsertElementInMaxHeap();

    }

}
