package LINKED_LIST;

public class InsertAtTheEndOfCircularLinkedList {
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
    private static void insertAtEnd(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            head.next=head;
            head.prev=head;
        }
        else
        {
            Node lastNode=head.prev;
            newNode.next=head;
            newNode.prev=lastNode;
            lastNode.next=newNode;
            head.prev=newNode;


        }
    }
    private static void printList()
    {
        Node temp=head;
        if(head!=null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insertAtEnd(i);
        printList();
    }

}
