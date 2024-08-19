package LINKED_LIST;


public class DeleteLastOfADoublyLinkedList {

    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    private static void insert(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static void main(String[] args) {

    }
}
