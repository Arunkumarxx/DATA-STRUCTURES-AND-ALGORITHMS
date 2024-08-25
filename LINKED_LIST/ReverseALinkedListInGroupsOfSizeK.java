package LINKED_LIST;

import java.util.Arrays;

public class ReverseALinkedListInGroupsOfSizeK {
    private static Node head;

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

    private static Node insert(int data,Node head)
    {
        Node newNode= new Node(data);
        if(head==null)
            return newNode;

        else {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }

        return head;
    }
    private static void printlist(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node reverse(Node head,int k)
    {
        Node temp=head;
        Node next=null;
        Node reverese=null;
        if(temp!=null)
        {
            for(int i=1; i<=k && temp!=null; ++i)
            {
                next=temp.next;
                temp.next=reverese;
                reverese=temp;
                temp=next;
            }
            Node temp2=reverese;
            while(temp2.next!=null)
                temp2=temp2.next;
            for(int i=1; i<=k && temp!=null; ++i)
            {
                next=temp.next;
                temp.next=temp2;
                temp2=temp;
                temp=next;
            }

        }
        return reverese;
    }

    public static void main(String[] args) {
        for(int i=1; i<=5; ++i)
            head=insert(i,head);
        printlist(head);
       head= reverse(head,3);
       printlist(head);
    }

}
