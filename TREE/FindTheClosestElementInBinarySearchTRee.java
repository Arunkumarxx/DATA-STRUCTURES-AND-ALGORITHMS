package TREE;

public class FindTheClosestElementInBinarySearchTree {
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

    static int minDiff(Tree root,int k) {
        int diff=Integer.MAX_VALUE;
        while(root!=null) {
            diff=Math.min(diff,Math.abs(root.data-k));
            if(root.data<k)
                root=root.right;
            else if(root.data>k)
                root=root.left;
            else
                return 0;
        }
        return diff;
    }

    public static void main(String[] args) {
        FindTheClosestElementInBinarySearchTree tree=new FindTheClosestElementInBinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);

        int k=12;
        System.out.println("Minimum difference with "+k+": "+minDiff(tree.root,k));
    }
}
