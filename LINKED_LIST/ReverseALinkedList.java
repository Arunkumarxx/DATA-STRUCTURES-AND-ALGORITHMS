package LINKED_LIST;

public class ReverseALinkedList {
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
    private static void reverse()
    {
       Node previous=null;
       Node curr =head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=previous;
            previous=curr;
            curr=next;
        }
        head=previous;
    }
    private static void reverseRecursive(Node head,Node previous)
    {
        if(head==null) {
            head = previous;
            return;
        }
        Node next=head.next;
        head.next=previous;
        reverseRecursive(next,head);
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
    public static void main(String[] args) {
        for(var i=1; i<=10; ++i)
            insert(i);
        printList();
//        reverse();
        reverseRecursive(head,null);
        printList();
    }
}
