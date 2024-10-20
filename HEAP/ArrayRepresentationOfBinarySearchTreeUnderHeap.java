package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer [] tree =new Integer[1000];
    int currentSize=0;
    int size=tree.length;

    private void insert(int val)
    {
        if(currentSize==size)
        {
            resize();
            size=tree.length;
        }
        int i=0;
        while(i<size)
        {
            if(tree[i]==null)
            {
                tree[i]=val;
                currentSize++;
            }
        }
    }
    private void resize()
    {
        Integer  [] resizedTree =new Integer[size*2];
        System.arraycopy(tree,0,resizedTree,0,resizedTree.length);
        tree=resizedTree;
    }

}
