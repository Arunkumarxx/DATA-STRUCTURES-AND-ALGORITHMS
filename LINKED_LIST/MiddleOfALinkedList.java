package LINKED_LIST;

public class MiddleOfALinkedList {

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
    private static Node insert(int data,)
    {

    }
    int getMiddle(Node head) {
        // Your code here.
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    private static void printList(Node head)
    {
        
    }
    public static void main(String[] args) {

    }

}
