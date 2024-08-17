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

    // Method to get the last node
    private static Node getLastNode(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    // Method to search for a node with a specific key
    private static Node search(Node head, int key) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        return temp;
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
        if (data == 5) {
            Node loopAdd = search(head, 2);
            if (loopAdd != null) {
                tail.next = loopAdd;
            }
        }
    }

    // Method to print the list (warning: this will print indefinitely if there is a loop)
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
