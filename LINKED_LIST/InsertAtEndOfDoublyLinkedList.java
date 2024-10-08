package LINKED_LIST;

public class InsertAtEndOfDoublyLinkedList {

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
        Node()
        {}
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
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    private static void printList()
    {
        Node temp=tail;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        printList();
    }

}
