package LINKED_LIST;

public class CircularDoublyLinkedList {
    private static Node head;

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
    }

    public static void main(String[] args) {
        
    }
}
