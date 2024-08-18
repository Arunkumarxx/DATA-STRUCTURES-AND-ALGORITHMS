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
    private static Node  reverse()
    {
        Node temp =head;
        Node previous=null;

        while(temp!=null)
        {
            Node next=temp.next;
            temp.next=previous;
            if(previous!=null)
            previous.prev=temp;
            previous=temp;
            temp=next;
        }
        if(previous!=null)
        {
            previous.prev=null;
            head=previous;
        }
        return previous;
    }
    private static Node reverseRecursive(Node head,Node previous)
    {
        if(head==null)
            return previous;

        Node next=head.next;
        head.next=previous;
        if(previous!=null)
            previous.prev=head;
        previous=head;
        return reverseRecursive(next,previous);
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
//        reverse();
      head=  reverseRecursive(head,null);
        printList();
    }

}
