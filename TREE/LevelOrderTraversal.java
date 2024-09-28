package TREE;

import java.util.ArrayList;

public class LevelOrderTraversal {
    private class  Tree {
        int data;
        Tree right;
        Tree left;

        Tree(int data)
        {
            this.data=data;
            this.left=right;
        }
    }
    private void insert()
    {

    }
    private Tree addNode(Tree root,int data)
    {
        if(root==null)
        {
            root=new Tree(data);
            return  root;
        }
        if(data<root.data)
            root.left=addNode(root.left,data);
        if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }
    private void print()
    {

    }
    private void InOrderTraversal()
    {

    }
    private static ArrayList<ArrayList<Integer>> res= new ArrayList<>();

    public static void main(String[] args) {

    }

}
