package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer [] heap =new Integer[1000];
    private void insert(int value)
    {
        if(heap[0]==null)
            heap[0]=value;
    }
    public static void main(String[] args) {
        ArrayRepresentationOfBinarySearchTreeUnderHeap tree =new ArrayRepresentationOfBinarySearchTreeUnderHeap();
        tree.insert(1);
        System.out.println(tree.heap[0] instanceof  Number);
    }

}
