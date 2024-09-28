package TREE;

import LINKED_LIST.NthNodeFromEndOfLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class LevelOrderTraversal {
    private Tree root;
    private class  Tree {
        int data;
        Tree right;
        Tree left;

        Tree(int data)
        {
            this.data=data;
            this.left=right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);
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
        InOrderTraversal(root);
    }
    private void InOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }
     ArrayList<ArrayList> res= new ArrayList<>();
    ArrayList<Integer> temp =new ArrayList<>();
    private void levelOrderTraversal(Tree root,int level)
    {
        if(root==null)
            return;
        if(level>= res.size())
            res.add(new ArrayList());

        res.get(level).add(root.data);

        levelOrderTraversal(root.left,level+1);
        levelOrderTraversal(root.right,level+1);
    }
    public static void main(String[] args) {
        LevelOrderTraversal tree =new LevelOrderTraversal();
        Random random =new Random();
        for(int i=0 ;i<=10;++i)
            tree.insert(random.nextInt(0,9));
        tree.print();
        tree.levelOrderTraversal(tree.root,0);
        for(ArrayList<ArrayList> x:tree.res)
            for(ArrayList y:x)
                System.out.print(y+" ");
    }

}
