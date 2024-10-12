package TREE;

public class PostOrderTreeTraversal {
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
        PostOrderTreeTraversal tree =new PostOrderTreeTraversal();
        for(int i=1; i<=3; ++i)
            tree.insert(i);
        tree.insert(-2);
        tree.insert(-3);
        tree.insert(-7);
        tree.insert(-5);
        tree.print();
    }
}
