package HEAP;

public class OperationsInMinHeap {
    class MinHeap {
        int[] harr;
        int capacity;
        int heap_size;
        MinHeap(int cap) {
            heap_size = 0;
            capacity = cap;
            harr = new int[cap];
        }
        int parent(int i) { return (i - 1) / 2; }
        int left(int i) { return (2 * i + 1); }
        int right(int i) { return (2 * i + 2); }

        int extractMin()
        {
            // Your code here.
            if(heap_size<=0){
                return -1;
            }
            int res = harr[0];
            harr[0] = harr[heap_size-1];
            heap_size--;
            MinHeapify(0);
            return res;
        }

        //Function to insert a value in Heap.
        void insertKey(int k)
        {
            // Your code here.
            if(heap_size>=capacity){
                return;
            }
            heap_size++;
            decreaseKey(heap_size-1, k);

        }

        //Function to delete a key at ith index.
        void deleteKey(int i)
        {
            // Your code here.
            if(i<0 || i>heap_size){
                return;
            }

            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
        }


        void decreaseKey(int i, int new_val)
        {
            harr[i] = new_val;
            while (i != 0 && harr[parent(i)] > harr[i]) {
                int temp = harr[i];
                harr[i] = harr[parent(i)];
                harr[parent(i)] = temp;
                i = parent(i);
            }
        }

        /* You may call below MinHeapify function in
          above codes. Please do not delete this code
          if you are not writing your own MinHeapify */
        void MinHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int smallest = i;
            if (l < heap_size && harr[l] < harr[i]) smallest = l;
            if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
            if (smallest != i) {
                int temp = harr[i];
                harr[i] = harr[smallest];
                harr[smallest] = temp;
                MinHeapify(smallest);
            }
        }
    }

}
