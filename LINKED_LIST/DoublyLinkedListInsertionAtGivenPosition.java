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
        Node newNode =new Node(data);
        if (pos <= 0) {
            // Insert at the beginning
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        }
        else {
            Node temp = head;
            for (int i = 0; i < =pos  && temp != null; ++i) {
                temp = temp.next;
            }

            if (temp != null) {
                // Inserting in the middle or at the end
                newNode.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
                newNode.prev = temp;

                // Update tail if inserting at the end
                if (newNode.next == null) {
                    tail = newNode;
                }
            }
        }
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
        insertAtPos(44,2);
        printList();
    }
}
