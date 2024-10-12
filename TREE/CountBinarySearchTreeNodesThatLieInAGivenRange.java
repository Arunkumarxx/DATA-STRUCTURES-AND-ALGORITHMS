package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class CountBinarySearchTreeNodesThatLieInAGivenRange {
    private Tree root;

    private class Tree {
        int data;
        Tree right,left;
        Tree(int value) {
            this.data=value;
            this.right=this.left=null;
        }
    }

    private void insert(int key) {
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

    int getCount(Tree root,int l,int h) {
        int count=0;
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while(!q.isEmpty()) {
            Tree curr=q.poll();
            if(curr.data>=l&&curr.data<=h)
                ++count;
            if(curr.left!=null&&curr.data>l)
                q.add(curr.left);
            if(curr.right!=null&&curr.data<h)
                q.add(curr.right);
        }
        return count;
    }

    public static void main(String[] args) {
        CountBinarySearchTreeNodesThatLieInAGivenRange tree=new CountBinarySearchTreeNodesThatLieInAGivenRange();
        for(int i=0;i<=5;++i)
            tree.insert(i);

        int l=2;
        int h=4;
        System.out.println("Count of nodes in range ["+l+", "+h+"] is: "+tree.getCount(tree.root,l,h));
    }
}
