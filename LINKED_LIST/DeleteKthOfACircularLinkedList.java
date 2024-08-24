package LINKED_LIST;

public class DeleteKthOfACircularLinkedList {
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
    private static Node insert(Node head, int data) {
        if (head == null) {
            // Creating the first node in the circular list
            head = new Node(data);
            head.next = head; // Point to itself to make it circular
        } else {
            // Inserting the new node at the end of the circular list
            Node temp = head;
            Node newNode = new Node(data);

            // Traverse to the last node
            while (temp.next != head) {
                temp = temp.next;
            }

            // Insert the new node at the end and make the list circular
            newNode.next = head;
            temp.next = newNode;
        }
        return head; // Always return the head of the circular list
    }
    private static void printList(Node head)
    {
        Node temp=head;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            head=insert(head,i);
        printList(head);
    }

}
