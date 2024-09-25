package TREE;

public class TREE  {
    private Tree root;
    private class Tree
    {
        int data;
        Tree right;
        Tree left;
        Tree(int value)
        {
            this.data=value;
            this.right=null;
            this.left=null;
        }
    }
    public static void main(String[] args) {
        TREE Tree =new TREE();

    }
}
