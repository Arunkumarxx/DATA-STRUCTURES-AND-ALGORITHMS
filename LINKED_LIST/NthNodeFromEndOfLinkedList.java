package LINKED_LIST;

import com.sun.security.jgss.GSSUtil;

public class NthNodeFromEndOfLinkedList {
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
        Node newNode =new Node(data);
        if(head==null)
            return newNode;

        else {
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
            return head;
        }
    }
    private static int  NthNode(Node head,int n)
    {
        Node start=head;
        Node end=head;
        for(int i=1; i<=n ;++i) {
            if(end==null)
                return-1;
            end=end.next;
        }
        while(end!=null)
        {
            start=start.next;
            end=end.next;
        }
        return start.data;
    }
    private static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=5;++i)
            head=insert(i,head);
        printList(head);
        System.out.println( NthNode(head,5));
    }

}
