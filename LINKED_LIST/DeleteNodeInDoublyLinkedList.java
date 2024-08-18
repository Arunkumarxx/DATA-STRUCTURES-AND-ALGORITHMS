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
    private static void printList()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
        insert(i);
        printList();
    }

}
