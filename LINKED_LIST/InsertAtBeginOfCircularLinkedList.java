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
            tail.next=head;
            tail.prev=head;
        }
        else {
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;
        }
    }
    private static void printList()
    {
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insertAtBegin(i);
        printList();
    }

}
