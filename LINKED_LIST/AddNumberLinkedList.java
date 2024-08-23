package LINKED_LIST;

public class AddNumberLinkedList {
    private static Node num1=null;
    private static Node num2=null;
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
    private static void insert(int data,Node head)
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
            lastNode.next=newNode;
            head.prev=newNode;
        }
    }
    private static void printList(Node head)
    {
        if(head!=null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }
    public static void main(String[] args) {
        insert(4,num1);
        insert(5,num1);

        insert(3,num2);
        insert(4,num2);
        insert(5,num2);

        printList(num1);
        printList(num2);
    }

}
