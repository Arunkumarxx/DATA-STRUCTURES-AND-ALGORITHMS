package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeToCircularLinkedList {
    private Tree root;
    Tree head,prev;

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
        Queue<Tree> q=new LinkedList<Tree>();
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

    Tree bTreeToClist(Tree root) {
        if(root==null)
            return null;

        bTreeToClist(root.left);

        if(prev==null)
            head=root;
        else {
            root.left=prev;
            prev.right=root;
        }
        prev=root;

        bTreeToClist(root.right);

        prev.right=head;
        head.left=prev;

        return head;
    }

    public static void main(String[] args) {
        BinaryTreeToCircularLinkedList tree=new BinaryTreeToCircularLinkedList();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        Tree head=tree.bTreeToClist(tree.root);
        Tree curr=head;
        do {
            System.out.print(curr.data+" ");
            curr=curr.right;
        } while (curr!=head);
    }
}
