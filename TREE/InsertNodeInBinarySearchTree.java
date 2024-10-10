package TREE;

public class InsertNodeInBinarySearchTree {
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
    private void InorderTraversal(Tree root)
    {

    }

    public static void main(String[] args) {
        InsertNodeInBinarySearchTree tree = new InsertNodeInBinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(234);
        tree.insert(543);
        tree.print();
    }

}
