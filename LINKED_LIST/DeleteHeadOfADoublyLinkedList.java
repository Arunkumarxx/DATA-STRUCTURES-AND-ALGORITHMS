package LINKED_LIST;

public class DeleteHeadOfADoublyLinkedList {

    private static Node head;
    private static Node tail;

    private  static  class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    private static void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
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
        for(int i=1; i<=5; ++i)
            insert(i);
        printList();
    }

}
