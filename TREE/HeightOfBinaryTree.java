package TREE;

public class HeightOfBinaryTree {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;

        Tree(int value)
        {
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);;
    }
    private Tree addNode(Tree root ,int value)
    {
        if(root==null)
        {
            root=new Tree(value);
            return root;
        }
        if(value< root.data)
            addNode(root.left,value);
        if(value>root.data)
            addNode(root.right,value);
        return root;
    }
   private void print()
    {
        InOrderTraversal(root);
    }
    private void InOrderTraversal(Tree node)
    {
        if(node!=null)
        {
            InOrderTraversal(node.left);
            System.out.print(node.data+" ");
            InOrderTraversal(node.right);
        }
    }
    public static void main(String[] args) {
        HeightOfBinaryTree tree =new HeightOfBinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.print();
    }

}
