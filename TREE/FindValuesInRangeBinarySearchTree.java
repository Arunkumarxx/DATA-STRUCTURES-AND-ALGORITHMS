package TREE;

import java.util.ArrayList;
import java.util.Stack;

public class FindValuesInRangeBinarySearchTree {
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

    public static ArrayList<Integer> printNearNodes(Tree root,int l,int h) {
        Stack<Tree> stack=new Stack<Tree>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(root!=null||!stack.isEmpty()) {
            while(root!=null) {
                stack.push(root);
                root=root.left;
            }
            Tree curr=stack.pop();
            if(curr.data>h)
                return res;
            if(curr.data>=l&&curr.data<=h)
                res.add(curr.data);
            root=curr.right;
        }
        return res;
    }

    public static void main(String[] args) {
        FindValuesInRangeBinarySearchTree tree=new FindValuesInRangeBinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);

        int l=2;
        int h=6;
        System.out.println("Nodes in range ["+l+", "+h+"] are: "+printNearNodes(tree.root,l,h));
    }
}
