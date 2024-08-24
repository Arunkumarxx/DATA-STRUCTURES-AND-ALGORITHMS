package LINKED_LIST;

public class CheckIdenticalLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static Node insert(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
        return head;
    }
    public boolean areIdentical(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    public static void main(String[] args) {

        CheckIdenticalLinkedList list = new CheckIdenticalLinkedList();
        Node head1 = null;
        head1 = insert(1, head1);
        head1 = insert(2, head1);
        head1 = insert(3, head1);
        Node head2 = null;
        head2 = insert(1, head2);
        head2 = insert(2, head2);
        head2 = insert(3, head2);
        boolean result = list.areIdentical(head1, head2);
        System.out.println(result?true:false);
    }
}
