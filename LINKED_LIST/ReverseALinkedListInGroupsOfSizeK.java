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
    public static void main(String[] args) {
        for(int i=1; i<=5; ++i)
            head=insert(i,head);
        printlist(head);
    }

}
