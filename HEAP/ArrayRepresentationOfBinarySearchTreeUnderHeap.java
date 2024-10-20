package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer [] tree =new Integer[1000];
    int currentSize=0;
    int size=tree.length;

    private void insert()
    {
        if(currentSize==size)
        {
            
        }
    }
    private void resize()
    {
        Integer  [] resizedTree =new Integer[size*2];
        System.arraycopy(tree,0,resizedTree,0,resizedTree.length);
        tree=resizedTree;
        size=tree.length;
    }

}
