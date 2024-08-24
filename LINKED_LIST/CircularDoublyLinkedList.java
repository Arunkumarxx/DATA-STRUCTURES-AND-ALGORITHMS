package LINKED_LIST;

public class CircularDoublyLinkedList {
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
    private static Node insert(int data,Node head)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            head.prev=head;
            head.next=head;
            return head;
        }
        else
        {
            
        }
    }

    public static void main(String[] args) {

    }
}
