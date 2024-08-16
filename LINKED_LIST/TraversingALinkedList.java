package LINKED_LIST;

public class TraversingALinkedList {

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


    private void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    private void printList() {
        Node itr = head;
        while (itr != null) {
            System.out.println(itr.data);
            itr = itr.next;
        }
    }

    public static void main(String[] args) {
        TraversingALinkedList list = new TraversingALinkedList();

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);

        list.printList();
    }
}
