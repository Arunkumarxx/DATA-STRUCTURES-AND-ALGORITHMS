package LINKED_LIST;

 class CircularLinkedListTraversal {
    private static Node head;

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

    private static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // List is empty
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            // List is not empty
            Node lastNode = head.prev;  // The last node in the list
            newNode.next = head;
            newNode.prev = lastNode;
            lastNode.next = newNode;
            head.prev = newNode;
        }
    }

    private static void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; ++i) {
            insert(i);
        }
        printList();
    }
}
