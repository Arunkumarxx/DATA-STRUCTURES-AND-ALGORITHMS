package LINKED_LIST;

public class FindMiddleOfCircularDoublyLinkedList {
    private static
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private static int findMiddle(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("The list is empty");
        }

        Node slow = head;
        Node fast = head;


        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = head;
        System.out.println(findMiddle(head));
    }
}

