package LINKED_LIST;

public class LINKED_LIST {


    private static class Node {
        int data;
        Node next;

        Node(int newData) {
            this.data = newData;
            this.next = null;
        }
    }


    private Node head;

    public LINKED_LIST() {
        head = null;
    }

    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }


    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node itr = head;
            while (itr.next != null) {
                itr = itr.next;
            }
            itr.next = newNode;
        }
    }

    public void deleteElement(int value) {
        if (head == null) return;
        if (value == head.data) {
            head = head.next;
            return;
        }
        Node itr = head;
        while (itr.next != null && itr.next.data != value) {
            itr = itr.next;
        }
        if (itr.next != null) {
            itr.next = itr.next.next;
        }
    }


    public void printList() {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.data + " ");
            itr = itr.next;
        }
        System.out.println();
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


    public int getLength() {
        int length = 0;
        Node itr = head;
        while (itr != null) {
            length++;
            itr = itr.next;
        }
        return length;
    }


    public static void main(String[] args) {
        LINKED_LIST list = new LINKED_LIST();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(30);
        list.printList();

        list.deleteElement(10);
        list.printList();

        System.out.println("Length: " + list.getLength());
        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 10: " + list.search(10));
    }
}
