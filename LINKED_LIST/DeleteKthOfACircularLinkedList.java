package LINKED_LIST;

public class DeleteKthOfACircularLinkedList {
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
    private static void insert(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            head.next=head;
        }
        else {
            Node newNode =new Node(data);
            Node temp=head;
            while(temp!=null)
            {
                
            }
        }
    }

    public static void main(String[] args) {

    }

}
