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
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtBegin(10);
        insertAtBegin(20);
        insertAtBegin(30);

    }

}
