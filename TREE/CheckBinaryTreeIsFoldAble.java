package I_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class CheckBinaryTreeIsFoldAble {
    private Tree root;

    private class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    private void insert(int value) {
        root=addNode(root,value);
    }

    private Tree addNode(Tree root,int data) {
        if (root==null) {
            root=new Tree(data);
            return root;
        }
        if (data<root.data)
            root.left=addNode(root.left,data);
        else if (data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }

    private void print() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Tree root) {
        if (root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    boolean IsFoldable(Tree node) {
        if (node==null)
            return true;

        Queue<Tree> queue=new LinkedList<>();
        queue.add(node.left);
        queue.add(node.right);

        while (!queue.isEmpty()) {
            Tree left=queue.poll();
            Tree right=queue.poll();

            if (left==null && right==null)
                continue;
            if (left==null || right==null)
                return false;

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public static void main(String[] args) {
        CheckBinaryTreeIsFoldAble tree1=new CheckBinaryTreeIsFoldAble();
        tree1.insert(10);
        tree1.insert(7);
        tree1.insert(15);
        tree1.insert(5);
        tree1.insert(9);
        tree1.insert(11);
        tree1.insert(17);
        System.out.println("Is tree1 foldable? "+tree1.IsFoldable(tree1.root));
        CheckBinaryTreeIsFoldAble tree2=new CheckBinaryTreeIsFoldAble();
        tree2.insert(10);
        tree2.insert(7);
        tree2.insert(15);
        tree2.insert(5);
        tree2.insert(12);
        System.out.println("Is tree2 foldable? "+tree2.IsFoldable(tree2.root));
    }
}
