package LINKED_LIST;

public class InsertionInSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(int value) {
        Node itr = head;
        while (itr != null) {
            if (itr.data == value)
                return true;
            itr = itr.next;
        }
        return false;
    }

    public void printList() {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.data + " ");
            itr = itr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionInSinglyLinkedList list = new InsertionInSinglyLinkedList();
        list.insertAtBeginning(23);
        System.out.println(list.search(23));
        list.printList();
    }
}
