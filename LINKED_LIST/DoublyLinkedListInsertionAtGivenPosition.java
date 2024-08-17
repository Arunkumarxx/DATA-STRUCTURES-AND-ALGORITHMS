package LINKED_LIST;

public class DoublyLinkedListInsertionAtGivenPosition {

    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private static void insert(int data)
    {
        Node newNode= new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    private static void insertAtPos(int data,int pos)
    {
        Node newNode =new Node(data);

        Node temp=head;

        for(int i=0; i<pos && temp!=null; ++i)
        {
            temp=temp.next;
        }
    }
    private static void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insert(2);
        insert(4);
        insert(5);
        insertAtPos(6,2);
        printList();
    }
}
