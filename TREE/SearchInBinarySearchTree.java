package TREE;

public class SearchInBinarySearchTree {
    private Tree root;
    private class Tree
    {
        int data;
        Tree right;
        Tree left;
        Tree(int data)
        {
            this.data=data;
        }
    }
    private void insert(int val)
    {
        root=addNode(root,val);
    }
    private Tree addNode(Tree root,int data)
    {
        if(root==null)
            return new Tree(data);
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }
    private boolean search(Tree root)
    {
        if(root==null)
            return false;
    }
    public static void main(String[] args) {

    }

}
