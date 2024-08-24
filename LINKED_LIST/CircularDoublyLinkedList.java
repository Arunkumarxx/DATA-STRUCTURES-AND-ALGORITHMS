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
            newNode.next=head;
            newNode.prev=head.prev;
            head.prev.next=newNode;
            head=newNode;
            return head;
        }
    }
    private static void printList(Node head)
    {
        Node temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            head=insert(i,head);
        printList(head);
    }
}
