package LINKED_LIST;

public class InsertAtBeginOfSinglyLinkedList {
    private static Node head;
    private static Node tail;
    private static class Node
    {
        int data;
        Node next;
        Node()
        {

        }
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static void insertAtBegin(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }
    public static void main(String[] args) {
        insertAtBegin(10);
        
    }
}

