package TREE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class InorderTraversalOfBinarySearchTree {
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
   private ArrayList<Integer> inOrder(Tree root) {
        ArrayList<Integer> res= new ArrayList<Integer>();
        Stack<Tree> stack =new Stack<>();
        while(root!=null || !stack.isEmpty())
        {
            while(root!=null)
            {
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            res.add(root.data);
            root=root.right;
        }
        return res;
    }
    public static void main(String[] args) {
        InorderTraversalOfBinarySearchTree tree = new InorderTraversalOfBinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        ArrayList<Integer> res =tree.inOrder(tree.root);
        System.out.println(res);
    }

}
