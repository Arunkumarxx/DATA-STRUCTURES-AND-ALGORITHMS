package LINKED_LIST;

public class InsertAtTheEndOfCircularLinkedList {
    private static Node head;

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
            head.prev=head;
            head.next=head;
        }
        else
        {
            Node lastNode=head.prev;
            lastNode.next=newNode;
            
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
