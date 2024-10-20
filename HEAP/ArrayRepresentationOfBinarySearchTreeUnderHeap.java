package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer [] heap =new Integer[1000];
    private void insert(int value)
    {
        if(heap[0]==null)
            heap[0]=value;
        int size=heap.length;
        int i=0;
        while(i<size)
        {
            if(heap[i]==null) {
                heap[i] = value;
                return;
            }
            if(value<heap[i])
            {
                i=(i)
            }
        }
    }
    public static void main(String[] args) {
        ArrayRepresentationOfBinarySearchTreeUnderHeap tree =new ArrayRepresentationOfBinarySearchTreeUnderHeap();
        tree.insert(1);
        System.out.println((int)tree.heap[0]);
    }

}
