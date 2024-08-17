package LINKED_LIST;

public class DeleteFirstNodeOfSinglyLinkedList {
    private static Node head;
    private static class Node
    {
        int data;
        Node next;

        Node()
        {}
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static void insert(int data)
    {
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }
    private static void printList()
    {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    private static void DeleteFirst()
    {
        head=head.next;
    }
    public static void main(String[] args) {
        for(int i=0; i<=2; ++i)
            insert(i);
        printList();
        DeleteFirst();
        DeleteFirst();
        DeleteFirst();
        DeleteFirst();
        System.out.println();
        printList();
    }
}
