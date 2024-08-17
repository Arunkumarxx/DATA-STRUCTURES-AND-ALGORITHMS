package LINKED_LIST;

public class InsertAtGivenPositionInSinglyLinkedList {

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
        Node()
        {

        }
    }
    private static void insertAtPos(int data,int pos)
    {
        Node temp=head;
        for(int i=1; i<pos && temp.next!=null; ++i)
        {
            temp=temp.next;
        }
        if(temp!=null && temp.next.next!=null)
        {
            Node newNode =new Node(data);
            newNode.next=temp.next.next;
            temp.next=newNode;
        }
    }
    public static void main(String[] args) {
        insertAtPos(10,1);
        
    }
}
