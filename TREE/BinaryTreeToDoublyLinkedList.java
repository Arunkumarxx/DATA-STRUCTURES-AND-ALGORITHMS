package TREE;

public class BinaryTreeToDoublyLinkedList {
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
    public static void main(String[] args) {

    }

}
