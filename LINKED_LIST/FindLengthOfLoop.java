package LINKED_LIST;

import java.util.HashMap;

public class FindLengthOfLoop {
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


    private static Node getLastNode(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    private static Node search(Node head, int key) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        return temp;
    }

    private static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        if (data == 5) {
            Node loopStartNode = search(head, 2);
            if (loopStartNode != null) {
                tail.next = loopStartNode;
            }
        }
    }

    private static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to find the length of the loop
    private static void lengthOfLoop() {
        HashMap<Node, Integer> hashMap = new HashMap<>();
        Node temp = head;
        int k = 0;
        while (temp != null) {
            if (hashMap.containsKey(temp)) {
                System.out.println("Length of loop: " + (k - hashMap.get(temp)));
                return;
            }
            hashMap.put(temp, k);
            temp = temp.next;
            k++;
        }
        System.out.println("No loop found.");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {
            insertAtEnd(i);
        }
        lengthOfLoop();
    }
}
