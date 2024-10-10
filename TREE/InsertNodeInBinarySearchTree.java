package TREE;

import java.util.Stack;

public class InsertNodeInBinarySearchTree {
    private Tree root;
    private class Tree
    {
        int data;
        Tree right;
        Tree left;
        Tree(int data)
        {
            this.data=data;
        }
    }
    private void insertRecursively(int val)
    {
        root=addNodeRecursive(root,val);
    }
    private void insertIteratively(int key)
    {
        Tree curr=root;
        while(curr!=null)
        {
            
        }
    }
    private Tree addNodeRecursive(Tree root,int data)
    {
        if(root==null)
            return new Tree(data);
        if(data<root.data)
            root.left=addNodeRecursive(root.left,data);
        else if(data>root.data)
            root.right=addNodeRecursive(root.right,data);
        return root;
    }
    private void print()
    {
        InorderTraversal(root);
    }
    private void InorderTraversal(Tree root)
    {
        Stack<Tree> stack =new Stack<>();
        Tree curr=root;
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
        InsertNodeInBinarySearchTree tree = new InsertNodeInBinarySearchTree();
        tree.insertIteratively(1);
        tree.insertIteratively(2);
        tree.insertIteratively(3);
        tree.insertIteratively(4);
        tree.insertIteratively(5);
        tree.print();
    }

}
