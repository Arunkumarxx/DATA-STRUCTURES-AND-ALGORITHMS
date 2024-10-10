package TREE;

import java.util.Random;

public class MinimumElementInRootBinarySearchTree {
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
        if(root==null)
        {
            root=new Tree(key);
            return;
        }
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
    private int minElement()
    {
        Tree temp=root;
        while (temp.left!=null)
            temp=temp.left;
        return temp.data;
    }

    public static void main(String[] args) {
        MinimumElementInRootBinarySearchTree tree =new MinimumElementInRootBinarySearchTree();
        Random random =new Random();
        for(int i=0;i<=50;++i)
            tree.insert(random.nextInt(23,234));
        System.out.println(tree.minElement());
    }

}
