package TREE;

import java.util.ArrayList;
import java.util.List;

public class PairSumInBinarySearchTree {
    private Tree root;
    private List<Integer> ele=new ArrayList<Integer>();

    private static class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(Tree root,int key) {
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

    private boolean findPair(Tree root,int target) {
        ele.clear();
        inOrderTraversal(root);
        int start=0,end=ele.size()-1;
        while(start<end) {
            int sum=ele.get(start)+ele.get(end);
            if(sum==target)
                return true;
            else if(sum<target)
                ++start;
            else
                --end;
        }
        return false;
    }

    private void inOrderTraversal(Tree root) {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        ele.add(root.data);
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        PairSumInBinarySearchTree tree=new PairSumInBinarySearchTree();
        tree.insert(tree.root=new Tree(5),1);
        tree.insert(tree.root,10);
        tree.insert(tree.root,20);

        int target=21;
        System.out.println("Pair with sum "+target+": "+tree.findPair(tree.root,target));
    }
}
