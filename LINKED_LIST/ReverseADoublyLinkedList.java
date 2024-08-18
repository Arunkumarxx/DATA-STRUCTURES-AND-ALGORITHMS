package LINKED_LIST;

public class ReverseADoublyLinkedList {

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
        Node()
        {

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
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    private static void reverse()
    {
        Node start=head;
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        Node end=temp;
        while(start!=end && start.prev!=end)
        {
            int t= start.data;
            start.data= end.data;
            end.data=t;
            start=start.next;
            end=end.prev;
        }
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
        for(int i=1; i<=1345; ++i)
            insert(i);
        printList();
        reverse();
        printList();
    }

}
