package TREE;

public class LeftViewOfBinaryTree {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree(int data)
        {
            this.data=data;
            this.left=right=null;
        }
    }

    private void insert(int value)
    {
        root=addNode(root,value);
    }
    private Tree addNode(Tree root,int data)
    {
        if(root==null)
        {
            root=new Tree(data);
            return root;
        }
        if(data<root.left.data)
            root.left=addNode(root.left,data);
        else if(data>root.right.data)
            root.right=addNode(root.right,data);
        return root;
    }
    private void print()
    {

    }
    private void inOrderTraversal(Tree root)
    {
        
    }
    public static void main(String[] args) {

    }

}
