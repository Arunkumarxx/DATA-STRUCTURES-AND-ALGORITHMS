package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class LevelOrderTraversal {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    private void insert(int value) {root=addNode(root,value);}
    private Tree addNode(Tree root,int data) {
        if(root==null) {
            root=new Tree(data);
            return root;
        }
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }

    private void print() {
        InOrderTraversal(root);
    }
    private void InOrderTraversal(Tree root) {
        if(root==null)
            return;
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }

    ArrayList<ArrayList<Integer>> res=new ArrayList<>();

    private void levelOrderTraversal(Tree root,int level) {
        if(root==null)
            return;
        if(level>=res.size())
            res.add(new ArrayList<>());
        res.get(level).add(root.data);
        levelOrderTraversal(root.left,level+1);
        levelOrderTraversal(root.right,level+1);
    }

    public ArrayList<Integer> levelOrderUsingQueue() {
        ArrayList<Integer> output=new ArrayList<>();
        if(root==null)
            return output;
        Queue<Tree> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Tree current=queue.poll();
            output.add(current.data);
            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }
        return output;
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree=new LevelOrderTraversal();
        Random random=new Random();
        for(int i=0;i<10;++i)
            tree.insert(random.nextInt(0,9));

        System.out.print("InOrder Traversal: ");
        tree.print();
        tree.levelOrderTraversal(tree.root,0);
        System.out.println("\nRecursive Level Order Traversal: ");
        for(ArrayList<Integer> level:tree.res) {
            for(Integer value:level) System.out.print(value+" ");
        }
        System.out.println("\nIterative Level Order Traversal using Queue: ");
        ArrayList<Integer> queueOutput=tree.levelOrderUsingQueue();
        for(Integer value:queueOutput)
            System.out.print(value+" ");
    }
}
