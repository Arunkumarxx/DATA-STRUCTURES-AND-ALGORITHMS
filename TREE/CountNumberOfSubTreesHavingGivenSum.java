package I_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class CountNumberOfSubTreesHavingGivenSum {
    private Tree root;
    int count=0;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }
    private void insert(int value) {
        if (root==null) {
            root=new Tree(value);
            return;
        }
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            if (curr.left==null) {
                curr.left=new Tree(value);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right==null) {
                curr.right=new Tree(value);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }
    int countSubtreesWithSumX(Tree root,int X) {
        subTreeCount(root,X);
        return count;
    }
    private int subTreeCount(Tree root,int target) {
        if(root==null)
            return 0;
        int left=subTreeCount(root.left,target);
        int right=subTreeCount(root.right,target);
        if(root.data+left+right==target)
            ++count;
        return root.data+left+right;
    }
    public static void main(String[] args) {
        CountNumberOfSubTreesHavingGivenSum tree=new CountNumberOfSubTreesHavingGivenSum();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        int X=5;
        System.out.println("Number of subtrees with sum "+X+": "+tree.countSubtreesWithSumX(tree.root,X));
    }
}
