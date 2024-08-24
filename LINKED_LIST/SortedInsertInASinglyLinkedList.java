package LINKED_LIST;

public class SortedInsertInASinglyLinkedList {

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
                temp=newNode;
                return temp;
            }
        }
        return head;
    }

    private static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
       head= insertSorted(10,head);
        head=insertSorted(20,head);
        head=insertSorted(15,head);
        printList(head);
    }

}
