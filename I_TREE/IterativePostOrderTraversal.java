package TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativePostOrderTraversal {
    private Tree root;
    class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree(int val)
        {
            this.data=val;
            this.left=right=null;
        }
    }
    private void insert(int val) {
        Queue<Tree> queue =new LinkedList<>();
        if(root==null) {
            root = new Tree(val);
            return;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            Tree curr=queue.poll();
            if(curr.left!=null)
                queue.add(curr.left);
            else{
                curr.left=new Tree(val);
                return;
            }
            if(curr.right!=null)
                queue.add(curr.right);
            else
            {
                curr.right=new Tree(val);
                return;
            }
        }
    }
    private void postOrderTraversal(Tree root) {
        if (root == null) {
            return;
        }

        Stack<Tree> stack1 = new Stack<>();
        Stack<Tree> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Tree curr = stack1.pop();
            stack2.push(curr);
            if (curr.left != null) {
                stack1.push(curr.left);
            }
            if (curr.right != null) {
                stack1.push(curr.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }


    public static void main(String[] args) {
        IterativePostOrderTraversal tree = new IterativePostOrderTraversal();
        for(int i=0;i<=15;++i)
            tree.insert(i);
        tree.postOrderTraversal(tree.root);
    }

}
