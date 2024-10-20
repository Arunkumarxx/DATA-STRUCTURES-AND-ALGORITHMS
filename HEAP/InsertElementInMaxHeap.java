package HEAP;

import java.util.Arrays;

public class InsertElementInMaxHeap {
    Integer[] heap = new Integer[1000];
    private int size = heap.length;
    private int currentSize = 0;
    private int lastInsertIndex = 0;

    private void insert(int value) {
        if (heap[0] == null) {
            heap[0] = value;
            ++currentSize;
            ++lastInsertIndex;
            return;
        }
        ++lastInsertIndex;
        int i = lastInsertIndex;
        if (i >= size || currentSize >= size)
            resize();
        heap[i] = value;
        ++currentSize;

        // Heapify-up (maintain max heap property)
        while (i > 0) {
            int parent = (i - 1) / 2;

            // Check if the parent node is null (although it should not be null)
            if (heap[parent] == null) {
                break; // Prevent accessing a null parent
            }

            if (heap[parent] < heap[i]) {
                // Swap parent and child values
                int temp = heap[parent];
                heap[parent] = heap[i];
                heap[i] = temp;
                i = parent; // Move up to the parent node
            } else {
                return; // Heap property is satisfied
            }
        }
    }

    private void resize() {
        Integer[] temp = new Integer[size * 2];
        System.arraycopy(heap, 0, temp, 0, currentSize); // Copy existing elements
        heap = temp; // Replace old heap with the new one
        size = heap.length; // Update the size
    }

    public static void main(String[] args) {
        InsertElementInMaxHeap heap = new InsertElementInMaxHeap();
        for (int i = 0; i <= 1000; ++i) {
            heap.insert(i);
        }
        for (Integer value : heap.heap) {
            if (value == null)
                return;
            System.out.print(value + " ");
        }
    }
}
