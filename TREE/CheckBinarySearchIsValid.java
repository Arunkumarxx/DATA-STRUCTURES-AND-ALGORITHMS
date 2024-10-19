package TREE;

public class CheckBinarySearchIsValid {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
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

    boolean isBST(Tree root) {
        return isValidBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isValidBinarySearchTree(Tree root,int range1,int range2) {
        if(root==null)
            return true;
        if(!(root.data>range1&&root.data<range2))
            return false;
        return isValidBinarySearchTree(root.left,range1,root.data)&&isValidBinarySearchTree(root.right,root.data,range2);
    }
    public static void main(String[] args) {
        CheckBinarySearchIsValid tree=new CheckBinarySearchIsValid();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);
        System.out.println("Is the tree a BST? "+tree.isBST(tree.root));
    }
}
