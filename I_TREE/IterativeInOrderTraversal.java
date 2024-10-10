package I_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeInOrderTraversal {
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
    private void print() {
       IterativeInOrderTraversal(root);
    }
    private void IterativeInOrderTraversal(Tree root)
    {
        Stack<Tree> stack =new Stack<>();
        Tree curr = root;
        while(curr!=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
    }

    public static void main(String[] args) {
        IterativeInOrderTraversal tree =new IterativeInOrderTraversal();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        tree.print();
    }

}
