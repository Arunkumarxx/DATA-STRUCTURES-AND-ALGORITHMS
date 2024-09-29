package TREE;

public class MirrorTree{
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree(int value)
        {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(int data)
    {
        root=addNode(root,data);
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
        else if (value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }
    private void print()
    {
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        
    }

}
