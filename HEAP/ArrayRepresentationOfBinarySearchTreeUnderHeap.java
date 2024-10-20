package HEAP;

import TREE.IterativePreOrderTraversal;

import java.io.FilterOutputStream;

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
                return;
            }
            if(val<tree[i])
                i=2*i+1;
            else if(val>tree[i])
                i=2*i+2;
            else  return;

            if(i>=size)
                resize();
        }
    }
    private void resize()
    {
        Integer  [] resizedTree =new Integer[size*2];
        System.arraycopy(tree,0,resizedTree,0,size);
        tree=resizedTree;
    }
    private void print()
    {
        inOrderTraversal(0);
    }

    private void inOrderTraversal(int ind)
    {
        if(tree[ind]==null)
            return;
        inOrderTraversal(2*ind+1);
        System.out.println(tree[ind]+" ");
        inOrderTraversal(2*ind+2);
    }
    public static void main(String[] args) {
        ArrayRepresentationOfBinarySearchTreeUnderHeap tree =new ArrayRepresentationOfBinarySearchTreeUnderHeap();
        for(int i=0;i<=10000;++i)
            tree.insert(i);
        tree.print();
    }

}
