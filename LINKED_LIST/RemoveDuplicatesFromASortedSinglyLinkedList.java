package LINKED_LIST;

import jdk.jshell.spi.SPIResolutionException;

public class RemoveDuplicatesFromASortedSinglyLinkedList {
    private static Node head;
    private static class  Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static Node insert(int data,Node head)
    {
        Node newNode= new Node(data);
        if(head==null)
            return newNode;

        else
        {
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
            return head;
        }
    }
    private static void printlist(Node head)
    {
        while(head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node removeDuplicate(Node head)
    {

        while(head!=null && head.next!=null)
            if(head.data== head.next.data)
                head.next=head.next.next;
            else head=head.next;
        return head;
    }
    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        printlist(head);
        head=removeDuplicate(head);
        printlist(head);
    }
}
