package TREE;

import java.util.Random;

public class TreeTraversal {

    private Tree root;
    private class Tree {
        int data;
        Tree right;
        Tree left;

        Tree(int value) {
            this.data = value;
            this.right = null;
            this.left = null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);
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
        traversal(root);
    }
    private void traversal(Tree root)
    {
        if(root!=null)
        {
            traversal(root.left);
            traversal(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        TreeTraversal tree =new TreeTraversal();
        Random random = new Random();
        for(int i=1; i<=10; ++i)
            tree.insert(random.nextInt(0,9));
        tree.print();
    }

}
