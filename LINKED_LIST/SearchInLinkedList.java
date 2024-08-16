package LINKED_LIST;

public class SearchInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LINKED_LIST {
        private Node head;

        public LINKED_LIST() {
            this.head = null;
        }

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public boolean searchKey(int key) {
            Node current = head;
            while (current != null) {
                if (current.data == key) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LINKED_LIST list = new LINKED_LIST();

        for (int i = 0; i <= 100; i++) {
            list.insertAtBeginning(i);
        }

        int keyToSearch = 16;
        boolean found = list.searchKey(keyToSearch);
        System.out.println("Key " + keyToSearch + " found: " + found);

        list.printList();
    }
}
