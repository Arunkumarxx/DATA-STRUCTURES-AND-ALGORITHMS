package TREE;

import java.util.Stack;

public class AVL_TreeImplementation {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        int height;
        private  Tree(int val)
        {
            this.data=val;
            left=right=null;
            height=0;
        }
    }
    private void insert(int val)
    {
        root=addNode(root,val);
    }
    private int  height(Tree root)
    {
        if(root==null)
            return 0;
        return root.height;
    }
    private Tree rightRotate(Tree root)
    {
        Tree leftChild=root.left;
        Tree rightChild=leftChild.right;

        leftChild.right=root;
        root.left=rightChild;

        root.height=1+Math.max(height(root.left),height(root.right));
        leftChild.height=1+Math.max(height(leftChild.left),height(leftChild.right));
        return leftChild;
    }
    private Tree leftRotate(Tree root)
    {
        Tree rightChild=root.right;
        Tree leftChild=rightChild.left;

        rightChild.left=root;
        root.right=leftChild;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        rightChild.height = 1 + Math.max(height(rightChild.left), height(rightChild.right));

        return rightChild;
    }
    private Tree addNode(Tree root,int val)
    {
        if(root==null)
            return new Tree(val);

        if(val<root.data)
            root.left=addNode(root.left,val);

        else if(val>root.data)
            root.right=addNode(root.right,val);

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        root.height=Math.max(leftHeight,rightHeight)+1;

        int balanceFactor=leftHeight-rightHeight;

        if(balanceFactor>1 && val<root.left.data)
        {
            return rightRotate(root);
        }
        if(balanceFactor>1 && val>root.left.data)
        {
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        if(balanceFactor<-1 && val>root.right.data)
        {
            return leftRotate(root);
        }
        if(balanceFactor<-1 && val<root.right.data)
        {
           root.right= rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    private void inOrderTraversal(Tree root)
    {
        Stack<Tree> stack = new Stack<>();
        Tree curr=root;
        while(curr!=null ||!stack.isEmpty())
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();
            System.out.println(curr.data+" "+curr.height);
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        AVL_TreeImplementation tree  =new AVL_TreeImplementation();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        tree.inOrderTraversal(tree.root);
    }
}