package LINKED_LIST;

public class DoublyLinkedList {

    private static Node head;
    private static Node tail;
    private static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
        Node()
        {}
    }
    private static void insert(int data)
    {
        Node newNode =head;
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            
        }
    }
    public static void main(String[] args) {
        insert(10);
    }

}
