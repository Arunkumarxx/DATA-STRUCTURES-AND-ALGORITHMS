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
        
    }
    public static void main(String[] args) {

    }

}
