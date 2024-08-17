package LINKED_LIST;

public class DeleteLastOfSinglyLinkedList {
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
        {}
    }
    private static void insert(int data)
    {
        Node newNode =new Node(data);
        if(head == null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
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
    private static void deleteFirst()
    {
        Node temp=head;
        if(head==null)
            return;

        if(head.next==null)
            return;
        
        while(temp.next.next!=null)
            temp=temp.next;

        temp.next=null;
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insert(i);
        deleteFirst();
        printList();


    }
}
