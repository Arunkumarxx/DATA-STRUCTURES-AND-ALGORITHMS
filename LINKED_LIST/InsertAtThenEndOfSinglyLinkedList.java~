package LINKED_LIST;

public class InsertAtThenEndOfSinglyLinkedList {

    private static Node head;
    private static Node tail;

    private static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
        Node()
        {

        }
    }
    private static void insertAtEnd(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
        }
    }
    private static void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        printList();
    }
}
