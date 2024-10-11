package TREE;

public class DeleteANodeFromBinarySearchTree {
    private Tree root;
    private class Tree {
        int data;
        Tree right,left;
        Tree(int value) {
            this.data=value;
            this.right=this.left=null;
        }
    }
    private void insert(int key) {
        if(root==null) {
            root=new Tree(key);
            return;
        }
        Tree curr=root;
        Tree parent=null;
        while(curr!=null) {
            parent=curr;
            if(key<curr.data)
                curr=curr.left;
            else if(key>curr.data)
                curr=curr.right;
            else return;
        }
        if(parent!=null&&key<parent.data)
            parent.left=new Tree(key);
        else if(parent!=null&&key>parent.data)
            parent.right=new Tree(key);
    }
    private Tree delete(Tree root,int key) {
        if(root==null) return root;
        if(key<root.data)
            root.left=delete(root.left,key);
        else if(key>root.data)
            root.right=delete(root.right,key);
        else {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            root.data=minValue(root.right);
            root.right=delete(root.right,root.data);
        }
        return root;
    }

    private int minValue(Tree root) {
        int minv=root.data;
        while(root.left!=null) {
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        DeleteANodeFromBinarySearchTree tree=new DeleteANodeFromBinarySearchTree();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        tree.root=tree.delete(tree.root,2);
    }
}
