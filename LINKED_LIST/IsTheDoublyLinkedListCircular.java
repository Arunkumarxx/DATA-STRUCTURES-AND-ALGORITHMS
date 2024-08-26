package LINKED_LIST;

public class IsTheDoublyLinkedListCircular {

    private static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // Create a new circular doubly linked list with the new node
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            Node tail = head.prev;

            // Insert the new node at the beginning
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;

            // Update the head to the new node
            head = newNode;
        }

        return head;
    }
    public static void main(String[] args) {

    }
    public static boolean isCircular(Node head)
    {
        return head.prev!=null?true:false;
    }

}
