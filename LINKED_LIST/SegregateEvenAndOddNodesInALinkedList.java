package LINKED_LIST;

import java.util.Random;

public class SegregateEvenAndOddNodesInALinkedList {
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
    }
    private static  Node  insertAtEnd(Node tail)
    {

    }
    private static void printList(Node head)
    {

    }
   private static  Node divide(Node head) {
        Node even=null;
        Node odd=null;

        Node evenTail=null;
        Node oddTail=null;
        Node curr=head;
        while(curr!=null)
        {
            Node newNode= new Node(curr.data);
            if(curr.data%2==0)
            {
                if(even==null)
                {
                    even=newNode;
                    evenTail=newNode;
                }
                else
                {
                    evenTail.next=newNode;
                    evenTail=newNode;
                }
            }
            else
            {
                if(oddTail==null)
                {
                    odd=newNode;
                    oddTail=newNode;
                }
                else
                {
                    oddTail.next=newNode;
                    oddTail=newNode;
                }
            }
            curr=curr.next;
        }
        evenTail.next=odd;
        return even;
    }
    public static void main(String[] args) {
        Random random =new Random();
        for(int i=1; i<=5; ++i)
            tail=insertAtEnd(tail);
        printList(head);// prinst result not head
    }

}
