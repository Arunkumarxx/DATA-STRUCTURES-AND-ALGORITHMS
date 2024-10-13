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
        root=addNode(root,val);
    }
    private int  height(Tree root)
    {
        if(root==null)
            return 0;
        return root.height;
    }

    private Tree addNode(Tree root,int val)
    {
        if(root==null)
            return new Tree(val);
        if(val<root.data)
            root.left=addNode(root.left,val);
        else if(val>root.data)
            root.right=addNode(root.right,val);
        root.height=Math.max(height(root.left),height(root.right))+1;
        return root;
    }

    public static void main(String[] args) {


    }
}