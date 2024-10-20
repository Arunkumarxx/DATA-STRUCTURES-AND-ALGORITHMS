package HEAP;

public class DeleteElementInHeap {
    Integer[] heap = new Integer[100];
    private int currentSize = 0;
    private int size = heap.length;

    private void resize() {
        Integer[] temp = new Integer[size * 2];
        System.arraycopy(heap, 0, temp, 0, currentSize);
        heap = temp;
        size = heap.length;
    }

    private void insert(int value) {
        if (currentSize >= size) {
            resize();
        }
        heap[currentSize] = value;
        ++currentSize;

        // Heapify up
        int i = currentSize - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] < heap[i]) {
                swap(parent, i);
                i = parent;
            } else {
                return;
            }
        }
    }

    private void delete() {
        if (currentSize == 0) {
            return;
        }

        // Move the last element to the root
        heap[0] = heap[currentSize - 1];
        heap[currentSize - 1] = null;
        --currentSize;

        // Heapify down
        int i = 0;
        while (i < currentSize) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            int largest = i;

            if (leftChild < currentSize && heap[leftChild] > heap[largest]) {
                largest = leftChild;
            }
            if (rightChild < currentSize && heap[rightChild] > heap[largest]) {
                largest = rightChild;
            }

            if (largest == i) {
                break; // No more swaps needed
            }

            swap(i, largest);
            i = largest;
        }
    }

    private void swap(int parent, int child) {
        int temp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = temp;
    }

    private void print() {
        for (int i = 0; i < currentSize; ++i) {
            System.out.print(heap[i] + " ");
        }
        System.out.println(); // To add a new line after printing the heap
    }

    public static void main(String[] args) {
        DeleteElementInHeap heap = new DeleteElementInHeap();
        for (int i = 0; i <= 10; ++i) {
            heap.insert(i);
        }
        heap.print(); // Print the heap before deletion
        heap.delete(); // Delete the root
        heap.print(); // Print the heap after deletion
    }
}
