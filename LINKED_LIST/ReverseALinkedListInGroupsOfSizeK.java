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
    private static Node reverse(Node head, int k) {
        if (head == null) return null;

        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        // Reverse first k nodes of the linked list
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Now, head points to the kth node. Connect the rest of the list recursively
        if (next != null) {
            head.next = reverse(next, k);
        }

        // prev is the new head of the reversed group
        return prev;
    }


    public static void main(String[] args) {
        for(int i=1; i<=5; ++i)
            head=insert(i,head);
        printlist(head);
       head= reverse(head,3);
       printlist(head);
    }

}
