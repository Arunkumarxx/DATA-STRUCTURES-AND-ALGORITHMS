package LINKED_LIST;

public class DeleteHeadOfCircularLinkedList {

    private static Node head;
    private static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private static Node  insert(Node head,int data)
    {
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    private  static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node deleteHead(Node head)
    {
        if(head==null)
            return head;

        Node temp=head;
        do{
            temp=temp.next;
            System.out.print(temp.data+" ");
        }
        while(temp.next!=head);

        return head;
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
           head= insert(head,i);
        printList(head);
    }

}
