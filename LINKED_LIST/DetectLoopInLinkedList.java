package LINKED_LIST;

public class DetectLoopInLinkedList {

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
    private static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     head=new Node(1);
     head.next=new Node(2);
     head.next.next=new Node(3);
     head.next.next.next=new Node(4);
      Node newNode=new Node(5);
      newNode.next=head.next;
      head.next.next=newNode;

     printList(head);
    }

}
