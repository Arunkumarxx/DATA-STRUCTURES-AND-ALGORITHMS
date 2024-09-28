package TREE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CountTheNodesAtDistanceKFromLeaf{
    private Tree root;

    private class Tree{
        int data;
        Tree left;
        Tree right;

        Tree(int data){
            left=right=null;
            this.data=data;
        }
    }

    private void insert(int value){
        root=addNode(root,value);
    }

    private Tree addNode(Tree root,int value){
        if(root==null){
            root=new Tree(value);
            return root;
        }
        if(value<root.data)
            root.left=addNode(root.left,value);
        else if(value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }

    private void print(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Tree root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        System.out.print(root.data+" ");
        postOrderTraversal(root.right);
    }

    private void countNodeLeafK(int k){
        HashSet<Tree> hashSet=new HashSet<>();
        ArrayList<Tree> path=new ArrayList<>();
        countTheNodeAtDistanceKfromLeaf(root,path,hashSet,k);
        System.out.println("Count of nodes at distance "+k+" from leaf: "+hashSet.size());
    }

    private void countTheNodeAtDistanceKfromLeaf(Tree root,ArrayList<Tree> path,HashSet<Tree> hashSet,int k){
        if(root==null)
            return;

        path.add(root);

        if(root.left==null&&root.right==null){
            if(path.size()-k-1>=0){
                Tree ancestor=path.get(path.size()-k-1);
                hashSet.add(ancestor);
            }
        }

        countTheNodeAtDistanceKfromLeaf(root.left,path,hashSet,k);
        countTheNodeAtDistanceKfromLeaf(root.right,path,hashSet,k);

        path.remove(path.size()-1);
    }

    public static void main(String[] args){
        CountTheNodesAtDistanceKFromLeaf binaryTree=new CountTheNodesAtDistanceKFromLeaf();
        Random random =new Random();
        for(int i=0 ;i<=50; ++i)
            binaryTree.insert(random.nextInt(0,9));
        binaryTree.print();
        System.out.println();

        binaryTree.countNodeLeafK(random.nextInt(0,9));
    }
}
