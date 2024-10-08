package LINKED_LIST;

public class DeleteNodeInDoublyLinkedList {
    private static Node head;
    private static Node tail;
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
    private static void insert(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    private static void delete (int pos)
    {
        Node temp=head;
        if(pos==1) {
            head=head.next;
            return;
        }
        int i=1;
        while(i!=pos)
        {
            temp=temp.next;
            ++i;
        }
        if(temp==null)
            return;
        if(temp.prev!=null)
            temp.prev.next=temp.next;
        else temp=temp.next;

        if(temp.next!=null)
            temp.next.prev=temp.prev;

    }
    private static void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
        insert(i);
        delete(1);
        printList();
    }

}
