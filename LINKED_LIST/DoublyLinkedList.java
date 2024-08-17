package LINKED_LIST;

public class DoublyLinkedList {

    private static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
        Node()
        {}
    }
    private static void insert(int data)
    {
        
    }
    public static void main(String[] args) {
        insert(10);
    }

}
