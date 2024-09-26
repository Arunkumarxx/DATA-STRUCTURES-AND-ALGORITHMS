package TREE;

public class PrintNodesAtKdistance {
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
        root=addNode(root);
    }
    private Tree addNode(Tree root)
    {
        
    }
    public static void main(String[] args) {

    }

}
