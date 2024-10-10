package TREE;

import java.util.ArrayList;
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
    ArrayList<Integer> inOrder(Tree root) {
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
        
    }

}
