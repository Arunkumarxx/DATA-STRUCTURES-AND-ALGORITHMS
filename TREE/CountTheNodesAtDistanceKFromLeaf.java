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
    private int countNodeLeafK(int k) {
        HashSet<Tree> hashSet = new HashSet<>();
        countTheNodeAtDistanceLeaf(root, k, 0, new Tree[1000], hashSet);
        return hashSet.size();
    }

    private void countTheNodeAtDistanceLeaf(Tree root, int k, int pathLen, Tree[] path, HashSet<Tree> hashSet) {
        if (root == null)
            return;
        path[pathLen] = root;
        pathLen++;
        if (root.left == null && root.right == null) {
            if (pathLen - k - 1 >= 0) {
                Tree ancestor = path[pathLen - k - 1];
                if (!hashSet.contains(ancestor)) {
                    hashSet.add(ancestor);
                }
            }
        }
        countTheNodeAtDistanceLeaf(root.left, k, pathLen, path, hashSet);
        countTheNodeAtDistanceLeaf(root.right, k, pathLen, path, hashSet);
    }

    public static void main(String[] args) {
        CountTheNodesAtDistanceKFromLeaf BinaryTree =new CountTheNodesAtDistanceKFromLeaf();
        BinaryTree.insert(1);
        BinaryTree.insert(2);
        BinaryTree.insert(3);
        BinaryTree.insert(4);
        BinaryTree.print();
        System.out.println(BinaryTree.countNodeLeafK(2));
    }

}
