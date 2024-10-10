package TREE;

import com.sun.jdi.ThreadGroupReference;

import java.util.Iterator;

public class SearchInBinarySearchTree {
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
    private void insert(int val)
    {
        root=addNode(root,val);
    }
    private Tree addNode(Tree root,int data)
    {
        if(root==null)
            return new Tree(data);
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }
    private boolean searchRecursive(Tree root,int key)
    {
        if(root==null)
            return false;
        if(key==root.data)
            return true;
        if(key<root.data)
           return searchRecursive(root.left,key);
        else
           return searchRecursive(root.right,key);
    }
    private boolean searchIterative(Tree root,int key)
    {
        while(root!=null)
        {
            if(key==root.data)
                return true;
            if(key<root.data)
                root=root.left;
            else root=root.right;
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInBinarySearchTree tree = new SearchInBinarySearchTree();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        System.out.println(tree.searchRecursive(tree.root, 1));
        System.out.println(tree.searchIterative(tree.root, 2));
    }

}
