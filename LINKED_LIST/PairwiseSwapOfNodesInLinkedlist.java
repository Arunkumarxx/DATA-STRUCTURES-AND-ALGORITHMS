package LINKED_LIST;

public class PairwiseSwapOfNodesInLinkedlist {

    private static Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for(int i=5; i>=1; --i)
            insertAtBegin(i);

        System.out.println("List:");
        printList(head);

        head = pairwiseSwap(head);

        System.out.println("After pairwise swap:");
        printList(head);
    }

    private static Node pairwiseSwap(Node node) {
        if (node == null || node.next == null)
            return node;

        Node newHead = node.next;
        Node prev = null;
        Node curr = node;

        while (curr != null && curr.next != null) {
            Node next = curr.next;
            Node jump = curr.next.next;

            next.next = curr;
            curr.next = jump;

            if (prev != null)
                prev.next = next;

            prev = curr;
            curr = jump;
        }
        return newHead;
    }
}
