package LINKED_LIST;

public class InsertAtBeginOfCircularLinkedList {
    private static Node head;
    private static Node tail;

    private static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
         {
             this.data=data;
             this.next=null;
             this.prev=null;
         }
    }
    private static void insertAtBegin(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            
        }
    }
    public static void main(String[] args) {

    }

}
