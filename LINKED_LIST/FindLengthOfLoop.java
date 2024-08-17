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

    // Method to insert a node at the end of the list
    private static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to create a loop in the list
    private static void createLoop(int startData) {
        Node loopStartNode = null;
        Node temp = head;

        // Find the node where the loop should start
        while (temp != null) {
            if (temp.data == startData) {
                loopStartNode = temp;
                break;
            }
            temp = temp.next;
        }

        if (loopStartNode != null) {
            // Point the last node's next to the loopStartNode to create a loop
            tail.next = loopStartNode;
        }
    }

    // Method to print the list (warning: this will print indefinitely if there is a loop)
    private static void printList(int maxIterations) {
        Node temp = head;
        int count = 0;
        while (temp != null && count < maxIterations) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
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
        // Insert nodes into the list
        for (int i = 1; i <= 10; ++i) {
            insertAtEnd(i);
        }

        // Create a loop in the list, where the loop starts at node with data 5
        createLoop(5);

        // Print the list (limit to 15 iterations to avoid infinite loop in case of loop creation)
        printList(15);

        // Find the length of the loop
        lengthOfLoop();
    }
}
