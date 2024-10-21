package HEAP;

public class OperationsInMinHeap {
    class MinHeap {
        int[] harr;
        int capacity;
        int heap_size;

        MinHeap(int cap) {
            heap_size=0;
            capacity=cap;
            harr=new int[cap];
        }

        int extractMin() {
            if(heap_size<=0)
                return -1;
            int res=harr[0];
            harr[0]=harr[heap_size-1];
            heap_size--;
            MinHeapify(0);
            return res;
        }

        void insertKey(int k) {
            if(heap_size>=capacity)
                return;
            heap_size++;
            decreaseKey(heap_size-1,k);
        }

        void deleteKey(int i) {
            if(i<0||i>=heap_size)
                return;
            decreaseKey(i,Integer.MIN_VALUE);
            extractMin();
        }

        void decreaseKey(int i,int new_val) {
            harr[i]=new_val;
            while(i!=0&&harr[(i-1)/2]>harr[i]) {
                int p=(i-1)/2;
                int temp=harr[i];
                harr[i]=harr[p];
                harr[p]=temp;
                i=p;
            }
        }

        void MinHeapify(int i) {
            int l=2*i+1;
            int r=2*i+2;
            int smallest=i;
            if(l<heap_size&&harr[l]<harr[i])
                smallest=l;
            if(r<heap_size&&harr[r]<harr[smallest])
                smallest=r;
            if(smallest!=i) {
                int temp=harr[i];
                harr[i]=harr[smallest];
                harr[smallest]=temp;
                MinHeapify(smallest);
            }
        }

        void printHeap() {
            for(int i=0;i<heap_size;i++) {
                System.out.print(harr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OperationsInMinHeap operations=new OperationsInMinHeap();
        MinHeap minHeap=operations.new MinHeap(11);

        minHeap.insertKey(3);
        minHeap.insertKey(2);
        minHeap.deleteKey(1);
        minHeap.insertKey(15);
        minHeap.insertKey(5);
        minHeap.insertKey(4);
        minHeap.insertKey(45);

        System.out.println("Heap after insertion:");
        minHeap.printHeap();

    }
}
