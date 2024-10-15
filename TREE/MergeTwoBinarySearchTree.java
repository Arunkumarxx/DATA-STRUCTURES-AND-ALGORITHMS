package TREE;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBinarySearchTree {
    private Tree root1,root2;
    int index1=0;
    List<Integer> result=new ArrayList<>();

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

    public List<Integer> merge(Tree root1,Tree root2) {
        List<Integer> list1=new ArrayList<>();
        inOrder(root1,list1);
        int size1=list1.size();
        mergeLists(root2,list1,size1);
        while(index1<size1) {
            result.add(list1.get(index1));
            index1++;
        }
        return result;
    }

    private void inOrder(Tree root,List<Integer> list1) {
        if(root==null)
            return;
        inOrder(root.left,list1);
        list1.add(root.data);
        inOrder(root.right,list1);
    }

    private void mergeLists(Tree root,List<Integer> list1,int size1) {
        if(root==null)
            return;
        mergeLists(root.left,list1,size1);
        while(index1<size1&&list1.get(index1)<root.data) {
            result.add(list1.get(index1));
            index1++;
        }
        result.add(root.data);
        mergeLists(root.right,list1,size1);
    }

    public static void main(String[] args) {
        MergeTwoBinarySearchTree tree=new MergeTwoBinarySearchTree();
        tree.insert(tree.root1=tree.new Tree(3),1);
        tree.insert(tree.root1,2);
        tree.insert(tree.root1,3);
        tree.insert(tree.root1,4);
        tree.insert(tree.root1,6);
        tree.insert(tree.root1,5);

        tree.insert(tree.root2=tree.new Tree(2),2);
        tree.insert(tree.root2,1);
        tree.insert(tree.root2,2);
        tree.insert(tree.root2,5);
        tree.insert(tree.root2,4);
        tree.insert(tree.root2,3);
        tree.insert(tree.root2,5);
        tree.insert(tree.root2,6);
        tree.insert(tree.root2,7);

        List<Integer> merged=tree.merge(tree.root1,tree.root2);
        System.out.println("Merged list: "+merged);
    }
}
