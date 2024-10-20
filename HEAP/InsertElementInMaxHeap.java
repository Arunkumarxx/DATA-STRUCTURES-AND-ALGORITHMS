package HEAP;

public class InsertElementInMaxHeap {
    Integer [] heap  = new Integer[100];
    private int size=heap.length;
    private int currentSize=0;

    private void insert(int value) {
        if (heap[0] == null) {
            heap[0] = value;
            ++currentSize;
            return;
        }
        int i = 0;
        while (i < size) {
            if (heap[i] == null) {
                heap[i] = value;
                ++currentSize;
                return;
            }
            if (heap[i] < value)
                i = 2 * i + 1;
            if (heap[i] > value)
                i = 2 * i + 2;
            else return;
            if (i >= size)
                resize();
        }
    }
    private void resize()
    {

    }
    public static void main(String[] args) {
        InsertElementInMaxHeap heap =new InsertElementInMaxHeap();

    }

}
