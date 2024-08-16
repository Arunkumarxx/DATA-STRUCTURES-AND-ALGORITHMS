package LINKED_LIST;

public class CountLinkedListNodes {

    private static class Node
    {
        int data ;
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
    private static Node head;

    private static void insertAtBegin(int data)
    {
        Node newNode =new Node();
        head.next= newNode;
        head=newNode;
    }

    private  static int count()
    {
        
    }
    public static void main(String[] args) {

    }
}
