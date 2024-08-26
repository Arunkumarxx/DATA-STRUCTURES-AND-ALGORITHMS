package LINKED_LIST;

public class IsTheDoublyLinkedListCircular {

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
    private static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {

            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            Node tail = head.prev;

            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }

        return head;
    }
    private static void printList(Node head) {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    private static boolean isCircular(Node head)
    {
        return head.prev!=null?true:false;
    }
    public static void main(String[] args) {

        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);

        printList(head);
        System.out.println(isCircular(head));

    }



}
