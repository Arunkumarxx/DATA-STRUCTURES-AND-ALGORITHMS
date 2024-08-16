package LINKED_LIST;

public class DeleteANodeInSingleLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node() {}
    }

    private Node head;


    private void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    private void delete(int ind) {
        if (head == null) {
            return;
        }

        if (ind == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < ind - 1; ++i) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        temp.next = temp.next.next;
    }


    private void printList() {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.data + " ");
            itr = itr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteANodeInSingleLinkedList list = new DeleteANodeInSingleLinkedList();
        for (int i = 0; i < 10; ++i) {
            list.insertAtBeginning(i);
        }

        System.out.println("Original List:");
        list.printList();

        // Delete node at index 2
        list.delete(2);

        System.out.println("List after deleting node at index 2:");
        list.printList();
    }
}
