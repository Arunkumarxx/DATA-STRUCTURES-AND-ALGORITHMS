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
    static int count=0;
    private int  countNodeLeafK(int k)
    {
        count=0;
        countTheNodeAtDistanceLeaf(root,k,0);
        return count;
    }
    HashSet<Tree> hashSet =new HashSet<>();
    private void countTheNodeAtDistanceLeaf(Tree root, int k, int pathLen, HashSet<Tree> hashSet) {
        if (root == null) return;

        // Add the current node to path array
        path[pathLen] = root;
        pathLen++;

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            if (pathLen - k - 1 >= 0) {
                Tree ancestor = path[pathLen - k - 1]; // Find the ancestor k nodes away
                // Add to hashSet to ensure unique nodes
                if (!hashSet.contains(ancestor)) {
                    hashSet.add(ancestor);
                }
            }
        }

        // Traverse to left and right subtrees
        countTheNodeAtDistanceLeaf(root.left, k, pathLen, hashSet);
        countTheNodeAtDistanceLeaf(root.right, k, pathLen, hashSet);
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
