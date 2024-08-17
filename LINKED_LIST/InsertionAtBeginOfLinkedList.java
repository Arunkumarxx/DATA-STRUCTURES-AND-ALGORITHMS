package LINKED_LIST;

public class InsertionAtBeginOfLinkedList {

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
    private static void insertAtBegin(int data)
    {
        Node newNode =new Node(data);
        newNode.prev=head
    }
    public static void main(String[] args) {

    }

}
