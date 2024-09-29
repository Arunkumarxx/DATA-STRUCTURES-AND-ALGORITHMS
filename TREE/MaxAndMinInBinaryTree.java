package TREE;

public class MaxAndMinInBinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left, right;
        Tree(int value) {
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }

    private void insert(int value) {
        root=addNode(root,value);
    }

    private Tree addNode(Tree root, int value) {
        if (root==null) {
            root=new Tree(value);
            return root;
        }
        if (value<root.data)
            root.left=addNode(root.left,value);
        else if (value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }

    private void print() {
        InOrderTraversal(root);
    }

    private void InOrderTraversal(Tree node) {
        if (node!=null) {
            InOrderTraversal(node.left);
            System.out.print(node.data+" ");
            InOrderTraversal(node.right);
        }
    }
    static int max=0;
    static int min=0;
    public static int findMax(Node root){
        max=Integer.MIN_VALUE;
        maxOfTree(root);
        return max;
    }
    private static void maxOfTree(Node root)
    {
        if(root==null)
            return ;

        maxOfTree(root.left);
        if(root.data>max)
            max=root.data;
        maxOfTree(root.right);

    }
    public static int findMin(Node root){
        //code here
        min=Integer.MAX_VALUE;
        minOfTree(root);
        return min;
    }
    private static void minOfTree(Node root)
    {
        if(root==null)
            return;
        minOfTree(root.left);
        if(root.data<min)
            min=root.data;
        minOfTree(root.right);
    }
    public static void main(String[] args) {

    }

}
