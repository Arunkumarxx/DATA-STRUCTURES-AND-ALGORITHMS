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
    public static void main(String[] args) {
        for(var i=1; i<=10; ++i)
            insert(i);
        
    }
}