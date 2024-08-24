package LINKED_LIST;

public class SortedInsertInASinglyLinkedList {

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

    private static Node  insertSorted(int data,Node head)
    {
        Node newNode =new Node(data);
        if(head==null)
            return newNode;
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data <= data && temp.next.data >= data)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                return head;
            }
        }
    }

    public static void main(String[] args) {

    }

}
