package LINKED_LIST;

public class InsertAtTheEndOfCircularLinkedList {
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
    }
    private static void insertAtEnd(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=head;
            tail.prev=head;

        }
    }
    private static void printList()
    {

    }

    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insertAtEnd(i);
        printList();
    }

}
