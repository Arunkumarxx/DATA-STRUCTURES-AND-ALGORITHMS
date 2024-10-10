package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class LeastCommonAncestorInBinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(int value) {
        if (root==null) {
            root=new Tree(value);
            return;
        }
        Queue<Tree> q=new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            if (curr.left==null) {
                curr.left=new Tree(value);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right==null) {
                curr.right=new Tree(value);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    Tree lca(Tree root,int n1,int n2) {
        return lcaOfBinaryTree(root,n1,n2);
    }

    private Tree lcaOfBinaryTree(Tree root,int n1,int n2) {

        if(root==null)
            return root;

        if(root.data==n1||root.data==n2)
            return root;

        Tree left=lcaOfBinaryTree(root.left,n1,n2);
        Tree right=lcaOfBinaryTree(root.right,n1,n2);

        if(left!=null&&right!=null)
            return root;

        return (left!=null)?left:right;
    }

    public static void main(String[] args) {
        LeastCommonAncestorInBinaryTree tree=new LeastCommonAncestorInBinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        Tree lca=tree.lca(tree.root,4,5);
        System.out.println("LCA(4,5): "+(lca!=null?lca.data:"null"));
    }
}
