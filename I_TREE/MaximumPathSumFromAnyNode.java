package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumPathSumFromAnyNode {
    private Tree root;
    int max=Integer.MIN_VALUE;

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

    int findMaxSum(Tree node) {
        maxSum(node);
        return max;
    }

    private int maxSum(Tree root) {
        if(root==null)
            return 0;
        int left=Math.max(maxSum(root.left),0);
        int right=Math.max(maxSum(root.right),0);

        int currMax=root.data+left+right;

        max=Math.max(currMax,max);

        return root.data+Math.max(left,right);
    }

    public static void main(String[] args) {
        MaximumPathSumFromAnyNode tree=new MaximumPathSumFromAnyNode();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.println("Max path sum of the tree: "+tree.findMaxSum(tree.root));
    }
}
