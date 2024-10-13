package TREE;
public class AVL_TreeImplementation {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        int height;
        private  Tree(int val)
        {
            this.data=val;
            left=right=null;
            height=0;
        }
    }
    private void insert(int val)
    {
        root=addNode(val);
    }
    private Tree addNode(Tree root,int val)
    {
        if(root==null)
            return new Tree(val);
        addNode();
    }

    public static void main(String[] args) {


    }
}