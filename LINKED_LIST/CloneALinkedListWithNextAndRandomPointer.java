package LINKED_LIST;

public class CloneALinkedListWithNextAndRandomPointer {

    // Definition for singly-linked list with a random pointer.
    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        CloneALinkedListWithNextAndRandomPointer cloner = new CloneALinkedListWithNextAndRandomPointer();
        Node clonedHead = cloner.copyList(head);

        printList(clonedHead);
    }

    Node copyList(Node head) {
        if (head == null) return null;

        Node current = head;

        while (current != null) {
            Node copy = new Node(current.data);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }


        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        current = head;
        Node dummy = new Node(0);
        Node copyCurrent = dummy;

        while (current != null) {
            Node copy = current.next;
            copyCurrent.next = copy;
            copyCurrent = copy;

            current.next = copy.next;
            current = current.next;
        }

        return dummy.next;
    }


    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print("Node data: " + current.data);
            if (current.random != null) {
                System.out.print(", Random data: " + current.random.data);
            }
            System.out.println();
            current = current.next;
        }
    }
}
