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

    private void insert()
    {
        root=addNode();
    }
    private Tree addNode(Tree root)
    {

    }
    public static void main(String[] args) {

    }

}
