package LINKED_LIST;

public class InsertAtGivenPositionInSinglyLinkedList {

    private static Node head;
    private static Node tail;
    private static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
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
            tail=newNode;
        }
    }
    private static void insertAtPos(int data,int pos)
    {
        Node temp=head;
        for(int i=1; i<pos && temp.next!=null; ++i)
        {
            temp=temp.next;
        }
        if(temp!=null && temp.next.next!=null)
        {
            Node newNode =new Node(data);
            newNode.next=temp.next.next;
            temp.next=newNode;
        }
    }
    private static void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        for(int i=0; i<=10;++i)
            insertAtEnd(i);

        insertAtPos(11,8);
        printList();
    }
}
