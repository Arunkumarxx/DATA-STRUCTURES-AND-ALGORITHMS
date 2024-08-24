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
    public static void main(String[] args) {
        
    }

}
