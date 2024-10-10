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

    Tree head=null;
    Tree tail=null;

    Tree bToDLL(Tree root) {
        inOrderTraversalToDLL(root);
        return head;
    }

    void inOrderTraversalToDLL(Tree root) {
        if (root==null)
            return;
        inOrderTraversalToDLL(root.left);
        addNodeToDLL(root);
        inOrderTraversalToDLL(root.right);
    }

    void addNodeToDLL(Tree node) {
        if (head==null) {
            head=tail=node;
            return;
        }
        tail.right=node;
        node.left=tail;
        tail=node;
        tail.right=null;
    }

    public static void main(String[] args) {
        BinaryTreeToDoublyLinkedList tree=new BinaryTreeToDoublyLinkedList();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        Tree head=tree.bToDLL(tree.root);

        Tree current=head;
        System.out.println("Doubly Linked List:");
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.right;
        }
    }
}
