package LINKED_LIST;

public class JoinTwolinkedList {

    private static Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return head;
    }

    private static void PrintList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node joinTheLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        Node t1 = head1;
        while (t1.next != null) {
            t1 = t1.next;
        }
        t1.next = head2;
        return head1;
    }

    public static void main(String[] args) {
        Node list1 = null;
        Node list2 = null;

        // Insert elements into list1
        for(int i = 1; i <= 5; ++i) {
            list1 = insert(list1, i);
        }

        // Insert elements into list2
        for(int i = 6; i <= 10; ++i) {
            list2 = insert(list2, i);
        }

        System.out.println("List 1:");
        PrintList(list1);

        System.out.println("List 2:");
        PrintList(list2);

        Node joinedList = joinTheLists(list1, list2);

        System.out.println("Joined List:");
        PrintList(joinedList);
    }

}
