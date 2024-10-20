package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer [] heap =new Integer[1000];
    private void resizeTree()
    {
        Integer [] tempheap = new Integer[heap.length*2];
        for(int i=0;i<heap.length;++i)
            tempheap[i]=heap[i];
        heap=tempheap;
    }
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
            if(2*(i+1)>size-1)
                resizeTree();
            if(value<heap[i])
                i = (2 * (i + 1)) - 1;
            else if(value>heap[i])
                i = (2 * (i + 1));
            else return;
        }
    }
    public static void main(String[] args) {
        ArrayRepresentationOfBinarySearchTreeUnderHeap tree =new ArrayRepresentationOfBinarySearchTreeUnderHeap();
        for(int i=0;i<=100;++i)
            tree.insert(i);
        System.out.println(tree.heap.length);
    }

}
