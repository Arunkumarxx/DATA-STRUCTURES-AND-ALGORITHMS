package I_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
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
            return root;
        }
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }
    private void print()
    {
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    private void leftView()
    {
        ArrayList<ArrayList<Integer>>  level=new ArrayList<>();
        Queue<Tree> queue =new LinkedList<>();
        Tree Root=root;
        queue.add(Root);
        while(!queue.isEmpty())
        {
            int len=queue.size();
            ArrayList<Integer> temp =new ArrayList<>();
            for(int i=0;i<len;++i)
            {
                Tree curr=queue.poll();
                if(i==len-1)
                    temp.add(curr.data);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            level.add(temp);
        }
        System.out.println(level);
    }
    public static void main(String[] args) {
        RightViewOfBinaryTree tree = new RightViewOfBinaryTree();
        for (int i = 1; i <= 20; ++i)
            tree.insert(i);
        tree.print();
        tree.leftView();
    }

}
