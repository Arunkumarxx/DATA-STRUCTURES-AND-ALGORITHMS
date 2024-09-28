package TREE;

import java.util.HashSet;

public class CountTheNodesAtDistanceKFromLeaf {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree (int data)
        {
            left=right=null;
            this.data=data;
        }
    }
    private void insert(int value)
    {
        root =addNode(root,value);
    }
    private Tree addNode(Tree root,int value)
    {
        if(root==null)
        {
            root=new Tree(value);
            return root;
        }
        if(value<root.data)
            root.left=addNode(root.left,value);
        if(value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }
    private void print()
    {
        PostOrderTraversal(root);
    }
    private void PostOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        PostOrderTraversal(root.left);
        System.out.print(root.data+" ");
        PostOrderTraversal(root.right);
    }
    private void countNodeLeafK(int k)
    {
        HashSet<Tree> hashSet=new HashSet<>();
        countTheNodeAtDistanceKfromLeaf(root,new Tree[1000],0,hashSet,k);
        System.out.println(hashSet.size());
    }
    private void  countTheNodeAtDistanceKfromLeaf(Tree root,Tree[] nodeAdd,int len,HashSet<Tree> hashSet,int k)
    {
        nodeAdd[len]=root;
        ++len;
        if(root.left==null && root.right==null)
        {
            if(len-k-1>=0 && !hashSet.contains(len-k-1))
                hashSet.add(nodeAdd[len-k-1]);
        }
        countTheNodeAtDistanceKfromLeaf(root,nodeAdd,len,hashSet,k);
        countTheNodeAtDistanceKfromLeaf(root,nodeAdd,len,hashSet,k);
    }

    public static void main(String[] args) {
        CountTheNodesAtDistanceKFromLeaf binaryTree =new CountTheNodesAtDistanceKFromLeaf();
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.print();
        System.out.println();
        binaryTree.countNodeLeafK(2);

    }

}
