package LINKED_LIST;

public class AddNumberLinkedList {
    private static Node head;
    private static class Node
    {
        int data;
        Node  prev;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    private static void insert(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            head.prev=head;
            head.next=head;
        }
        else {
            Node lastNode =head.prev;
            newNode.next=head;
            newNode.prev=lastNode;
            lastNode.next=head;
            head.prev=newNode;
        }
    }
    public static void main(String[] args) {

    }

}
