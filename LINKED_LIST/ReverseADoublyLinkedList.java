package LINKED_LIST;

public class ReverseADoublyLinkedList {

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
        Node()
        {

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
        else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    private static void reverse()
    {
        Node previous;
        Node current;
        Node temp=head;
        while(temp.next!=null)
        {
            previous=temp;
            current=temp.next;

            current.next=previous;
            previous.prev=current;

            temp=temp.next;
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
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insert(i);
        printList();
        reverse();
        printList();
    }

}
