package LINKED_LIST;


public class DeleteLastOfADoublyLinkedList {

    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    private static void insert(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    private static void deleteLast()
    {
        if(head==null)
            return;
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        if(temp.prev==null)
            temp=null;
        else {
            temp.prev = null;
            temp=null;
        }
    }
    private static void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        for(int i=1; i<=10; ++i)
            insert(i);
        printList();
        printList();
    }
}
