package TREE;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListToBinaryTree {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    Tree root;

    private class Tree {
        int data;
        Tree left, right;
        Tree(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    public Tree convert(Node head, Tree node) {
        Node curr=head;
        while (curr!=null) {
            insert(curr.data);
            curr=curr.next;
        }
        return root;
    }

    private void insert(int data) {
        if (root==null) {
            root=new Tree(data);
            return;
        }
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            if (curr.left==null) {
                curr.left=new Tree(data);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right==null) {
                curr.right=new Tree(data);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    public void insertNode(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void printLevelOrder() {
        if (root==null) return;
        Queue<Tree> q=new LinkedList<Tree>();

        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            System.out.print(curr.data+" ");
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        LinkedListToBinaryTree llbt=new LinkedListToBinaryTree();
        llbt.insertNode(1);
        llbt.insertNode(2);
        llbt.insertNode(3);
        llbt.insertNode(4);
        llbt.insertNode(5);

        llbt.convert(llbt.head, llbt.root);
        llbt.printLevelOrder();
    }
}
