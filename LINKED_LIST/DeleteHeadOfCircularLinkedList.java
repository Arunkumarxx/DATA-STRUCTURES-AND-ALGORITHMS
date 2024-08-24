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
    private static void   insert(Node head,int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head=newNode;
            head.next=head;
            head.prev=head;
        }
        else {
            Node lastNode =head.prev;
            newNode.next=head;
            newNode.prev=lastNode;
            lastNode.next=newNode;
            head.prev=newNode;
            head=newNode;
        }
//        return head;
    }
    private  static void printList(Node head)
    {
        if(head!=null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
            System.out.println();
        }
    }
    private static Node deleteHead(Node head)
    {
        return head;
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
           head= insert(head,i);
        printList(head);
    }

}
