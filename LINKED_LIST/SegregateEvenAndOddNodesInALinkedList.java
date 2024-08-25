package LINKED_LIST;

import java.util.Random;

public class SegregateEvenAndOddNodesInALinkedList {
    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node insertAtEnd(Node tail) {
        Random random = new Random();
        int randomData = random.nextInt(100);
        Node newNode = new Node(randomData);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        return tail;
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node divide(Node head) {
        Node even = null, odd = null;
        Node evenTail = null, oddTail = null;
        Node curr = head;

        while (curr != null) {
            Node newNode = new Node(curr.data);
            if (curr.data % 2 == 0) {
                if (even == null) {
                    even = newNode;
                    evenTail = even;
                } else {
                    evenTail.next = newNode;
                    evenTail = newNode;
                }
            } else {
                if (odd == null) {
                    odd = newNode;
                    oddTail = odd;
                } else {
                    oddTail.next = newNode;
                    oddTail = newNode;
                }
            }
            curr = curr.next;
        }

        if (evenTail != null) {
            evenTail.next = odd;
        } else {
            even = odd;
        }

        return even;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i)
            tail = insertAtEnd(tail);

        System.out.println("Org List:");
        printList(head);

        Node segregatedList = divide(head);
        System.out.println("Segregated List (Even followed by Odd):");
        printList(segregatedList);
    }
}
