package TREE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FindCommonNodesInTwoBinarySearchTree {
    private Tree root1,root2;
    private HashMap<Integer,Integer> freq=new HashMap<>();

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(Tree root,int key) {
        if(root==null) {
            root=new Tree(key);
            return;
        }
        Tree curr=root;
        Tree parent=null;
        while(curr!=null) {
            parent=curr;
            if(key<curr.data)
                curr=curr.left;
            else if(key>curr.data)
                curr=curr.right;
            else return;
        }
        if(parent!=null&&key<parent.data)
            parent.left=new Tree(key);
        else if(parent!=null&&key>parent.data)
            parent.right=new Tree(key);
    }

    public ArrayList<Integer> findCommon(Tree root1,Tree root2) {
        freq.clear();
        preOrderTraversal(root1);
        ArrayList<Integer> result=new ArrayList<Integer>();
        preOrderTraversal(root2,result);
        Collections.sort(result);
        return result;
    }

    private void preOrderTraversal(Tree root) {
        if(root==null)
            return;
        freq.put(root.data,1);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void preOrderTraversal(Tree root,ArrayList<Integer> result) {
        if(root==null)
            return;
        if(freq.containsKey(root.data))
            result.add(root.data);
        preOrderTraversal(root.left,result);
        preOrderTraversal(root.right,result);
    }
    public static void main(String[] args) {
        FindCommonNodesInTwoBinarySearchTree tree=new FindCommonNodesInTwoBinarySearchTree();
        tree.insert(tree.root1=tree.new Tree(5),1);
        tree.insert(tree.root1,10);
        tree.insert(tree.root1,20);
        tree.insert(tree.root2=tree.new Tree(10),5);
        tree.insert(tree.root2,15);
        tree.insert(tree.root2,20);

        ArrayList<Integer> commonNodes=tree.findCommon(tree.root1,tree.root2);
        System.out.println("Common nodes: "+commonNodes);
    }
}
