package TREE;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBinarySearchTree {
    private Tree root1,root2;

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
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        inOrderTraversal(root1,list1);
        inOrderTraversal(root2,list2);
        return mergeTwoList(list1,list2);
    }

    private List<Integer> mergeTwoList(List<Integer> list1,List<Integer> list2) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int i=0,j=0;
        int n1=list1.size();
        int n2=list2.size();
        while(i<n1&&j<n2) {
            if(list1.get(i).equals(list2.get(j))) {
                res.add(list1.get(i++));
                res.add(list2.get(j++));
            } else if(list1.get(i)<list2.get(j)) {
                res.add(list1.get(i++));
            } else {
                res.add(list2.get(j++));
            }
        }
        while(i<n1)
            res.add(list1.get(i++));
        while(j<n2)
            res.add(list2.get(j++));
        return res;
    }

    private void inOrderTraversal(Tree root,ArrayList<Integer> list) {
        if(root==null)
            return;
        inOrderTraversal(root.left,list);
        list.add(root.data);
        inOrderTraversal(root.right,list);
    }

    public static void main(String[] args) {
        MergeTwoBinarySearchTree tree=new MergeTwoBinarySearchTree();
        tree.insert(tree.root1=tree.new Tree(3),1);
        tree.insert(tree.root1,2);
        tree.insert(tree.root1,3);
        tree.insert(tree.root1,4);
        tree.insert(tree.root1,6);
        tree.insert(tree.root1,5);

        tree.insert(tree.root2=tree.new Tree(2),0);
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
