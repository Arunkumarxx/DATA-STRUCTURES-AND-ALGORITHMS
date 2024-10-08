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
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }

    private  static int count()
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    public static void main(String[] args) {
        for(int i=0; i<100; ++i)
            insertAtBegin(i*i);
        System.out.println(count());
    }
}
