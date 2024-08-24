package LINKED_LIST;

public class DeleteWithoutHeadPointer {

   private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void deleteNode(Node nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.next == null)
            return;
        Node nextNode = nodeToDelete.next;
        nodeToDelete.value = nextNode.value;
        nodeToDelete.next = nextNode.next;
        nextNode = null;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        printList(head);

        deleteNode(head.next.next);

        printList(head);
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
