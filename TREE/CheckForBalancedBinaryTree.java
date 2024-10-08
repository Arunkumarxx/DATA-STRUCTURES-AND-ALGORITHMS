package TREE;

public class CheckForBalancedBinaryTree {
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
    private boolean isBalancedBinaryTree()
    {
        return checkBalancedBinaryTree(root)!=-1;
    }

    private int checkBalancedBinaryTree(Tree root)
    {
        if(root==null)
            return 0;
        int lHeight=checkBalancedBinaryTree(root.left);
        int rHeight=checkBalancedBinaryTree(root.right);
        if(lHeight==-1||rHeight==-1|| Math.abs(lHeight-rHeight)>1)
            return -1;
        return Math.max(lHeight,rHeight)+1;
    }
    public static void main(String[] args) {
        CheckForBalancedBinaryTree tree = new CheckForBalancedBinaryTree();
        for(int i=0 ;i<=3;++i)
            tree.insert(i);
        tree.print();
        System.out.println();
        System.out.println(tree.isBalancedBinaryTree());
    }

}
