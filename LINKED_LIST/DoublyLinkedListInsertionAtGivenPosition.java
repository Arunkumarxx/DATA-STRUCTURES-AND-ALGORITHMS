package LINKED_LIST;

public class DoublyLinkedListInsertionAtGivenPosition {

    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private static void insert(int data)
    {
        Node newNode= new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    private static void insertAtPos(int data,int pos)
    {
        Node newNode =new Node(data);
        if(pos<=1 || head==null)
        {
            newNode.next=head;
            if(head!=null)
                head.prev=newNode;
            head=newNode;
            if(tail==null)
                tail=newNode;
        }
        else
        {
            Node temp=head;

            for(int i=1; i<pos- 1&& temp!=null; ++i)
                temp=temp.next;

            if(temp!=null && temp.next!=null)
            {
                newNode.next=temp.next;
                newNode.prev=temp;
                temp.next.prev=newNode;
                temp.next=newNode;

            }
            else {
                newNode.prev=tail;
                if(tail!=null)
                    tail.next=newNode;
                tail=newNode;
            }
        }
    }
    private static void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insert(2);
        insert(4);
        insert(5);
        insertAtPos(6,2);
        printList();
    }
}
