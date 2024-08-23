package LINKED_LIST;

public class AddNumberLinkedList {
    private static Node num1 = null; // Initialize num1
    private static Node num2 = null; // Initialize num2

    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private static void insert(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            Node lastNode = head.prev;
            newNode.next = head;
            newNode.prev = lastNode;
            lastNode.next = newNode;
            head.prev = newNode;
        }
    }

    private static void printList(Node head) {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize lists
        num1 = new Node(0); // Create a dummy node to start the list
        num1.prev = num1;
        num1.next = num1;

        num2 = new Node(0); // Create a dummy node to start the list
        num2.prev = num2;
        num2.next = num2;

        // Insert values
        insert(4, num1);
        insert(5, num1);

        insert(3, num2);
        insert(4, num2);
        insert(5, num2);

        // Print lists
        printList(num1);
        printList(num2);
    }
}
