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
    private boolean search(Tree root,int key)
    {
        if(root==null)
            return false;
        if(key==root.data)
            return true;
        if(key<root.data)
           return search(root.left,key);
        else if(key>root.data)
           return search(root.right,key);
        return false;
    }
    public static void main(String[] args) {
        SearchInBinarySearchTree tree = new SearchInBinarySearchTree();
        for(int i=0;i<=5;++i)
            tree.insert(i);
        System.out.println(tree.search(tree.root, 5));
    }

}
