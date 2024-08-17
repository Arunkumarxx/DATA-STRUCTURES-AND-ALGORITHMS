package LINKED_LIST;

public class InsertionAtBeginOfLinkedList {

    private static Node head;
    private static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
         this.data=data;
         this.prev=null;
         this.next=null;
        }
    }
    private static void insertAtBegin(int data)
    {
        Node newNode =new Node(data);
        if(head!=null)
            newNode.prev=head;
        newNode.next=head;
        head=newNode;
    }
    private static void printList()
    {
        Node temp =head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insertAtBegin(i);
        printList();
    }

}
