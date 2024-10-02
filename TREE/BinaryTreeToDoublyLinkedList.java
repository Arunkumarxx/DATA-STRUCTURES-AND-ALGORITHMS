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

    Node head=null;
    Node tail=null;

    Node bToDLL(Node root)
    {
        //  Your code here
        inOrderTraversal(root);
        return head;
    }
    void inOrderTraversal(Node root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        addNode(root.data);
        inOrderTraversal(root.right);
    }
    void addNode(int value)
    {
        Node newNode =new Node(value);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.right=newNode;
        newNode.left=tail;
        tail=newNode;
    }
    public static void main(String[] args) {

    }

}
