package TREE;

import java.util.*;

public class ConvertLevelOrderTraversalToBinarySearchTree {
     private class TreeRange {
        Tree node;
        int min, max;

        TreeRange(Tree node, int min, int max) {
            this.node = node;
            this.min = min;
            this.max = max;
        }
    }
   private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            left=right=null;
        }
    }
    private Tree constructBST(int[] arr) {
        if(arr.length==0) return null;
        Tree root=new Tree(arr[0]);
        Queue<TreeRange> queue=new LinkedList<>();
        queue.add(new TreeRange(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        int i=1;
        while(!queue.isEmpty()&&i<arr.length) {
            TreeRange curr=queue.poll();
            if(i<arr.length&&arr[i]>curr.min&&arr[i]<curr.node.data) {
                curr.node.left=new Tree(arr[i]);
                queue.add(new TreeRange(curr.node.left,curr.min,curr.node.data));
                i++;
            }
            if(i<arr.length&&arr[i]>curr.node.data&&arr[i]<curr.max) {
                curr.node.right=new Tree(arr[i]);
                queue.add(new TreeRange(curr.node.right,curr.node.data,curr.max));
                i++;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        ConvertLevelOrderTraversalToBinarySearchTree tree=new ConvertLevelOrderTraversalToBinarySearchTree();
        int[] arr={3,1,4,2};
        Tree root=tree.constructBST(arr);
        System.out.println("In-order Traversal:");
        printInOrder(root);
        System.out.println();
        System.out.println("Tree Structure:");
        printStructure(root, 0);
    }

    private static void printInOrder(Tree root) {
        if(root!=null) {
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }
    private static void printStructure(Tree root, int level) {
        if(root!=null) {
            printStructure(root.right, level+1);
            System.out.println("  ".repeat(level) + root.data);
            printStructure(root.left, level+1);
        }
    }
}
