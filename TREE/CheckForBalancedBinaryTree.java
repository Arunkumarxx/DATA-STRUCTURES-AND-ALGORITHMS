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
        checkBalancedBinaryTree(root);
        return isValid;
    }
    boolean isValid=true;
    private int checkBalancedBinaryTree(Tree root)
    {
        if(root==null|| !isValid)
            return 0;
        int lHeight=1+checkBalancedBinaryTree(root.left);
        int rHeight=1+checkBalancedBinaryTree(root.right);
        int height=Math.max(lHeight,rHeight)-Math.min(lHeight,rHeight);
        if(height>=1) {
            isValid = false;
            return 0;
        }
        return Math.max(lHeight,rHeight);
    }
    public static void main(String[] args) {
        CheckForBalancedBinaryTree tree = new CheckForBalancedBinaryTree();
        for(int i=0 ;i<=15;++i)
            tree.insert(i);
        tree.print();
        System.out.println(tree.isBalancedBinaryTree());
    }

}
