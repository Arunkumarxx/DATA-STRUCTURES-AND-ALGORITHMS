package LINKED_LIST;

import com.sun.security.jgss.GSSUtil;

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
       int p=0;
       Node temp=head;
       while(p<pos)
       {
           temp=temp.next;
           ++p;
       }
       Node newNode =new Node(data);
       newNode.next=temp.next;
       newNode.prev=temp;
       temp.next=newNode;
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
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insertAtPos(44,0);
        printList();
    }
}
