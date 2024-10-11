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
        Node curr=root;

        while(curr!=null && curr.data!=key)
        {
            if(key<curr.data)
                curr=curr.left;
            else if(key>curr.data)
                curr=curr.right;
        }
        if(curr!=null)
        {

            if(curr.left==null && curr.right==null && root.data==key)
                return null;
            if(curr.left!=null && curr.right!=null)
            {
                Node newHead=curr.left;
                Node newRoot=newHead;
                while(newHead.right!=null)
                    newHead=newHead.right;
                newHead.right=curr.right;
                return newRoot;
            }
            if(curr.left==null && curr.right!=null)
                return curr.right;
            if(curr.left!=null && curr.right==null)
                return curr.left;
        }
        return root;
    }

    public static void main(String[] args) {
        DeleteANodeFromBinarySearchTree tree  =new DeleteANodeFromBinarySearchTree();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        tree.delete(2);
    }

}
