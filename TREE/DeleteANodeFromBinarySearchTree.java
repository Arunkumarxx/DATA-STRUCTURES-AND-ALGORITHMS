package TREE;

public class DeleteANodeFromBinarySearchTree {
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
    private void insert(int key)
    {
        if(root==null)
        {
            root=new Tree(key);
            return;
        }
        Tree curr=root;
        Tree parent=null;
        while(curr!=null)
        {
            parent=curr;
            if(key<curr.data)
                curr=curr.left;
            else if(key>curr.data)
                curr=curr.right;
            else return;
        }
        if(parent!=null && key<parent.data)
            parent.left=new Tree(key);
        else if( parent!=null && key>parent.data)
            parent.right=new Tree(key);
    }
    private void delete(int key)
    {

    }

    public static void main(String[] args) {
        DeleteANodeFromBinarySearchTree tree  =new DeleteANodeFromBinarySearchTree();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        tree.delete(2);
    }

}
