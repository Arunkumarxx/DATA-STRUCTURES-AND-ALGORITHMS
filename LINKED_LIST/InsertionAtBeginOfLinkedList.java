package LINKED_LIST;

public class InsertionAtBeginOfLinkedList {

    private static Node head;
    private static Node tail;
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
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
      else {  newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
    }
    private static void printList()
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insertAtBegin(i);
        printList();
    }

}
