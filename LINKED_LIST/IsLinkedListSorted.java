package LINKED_LIST;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IsLinkedListSorted {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println(isSorted(head));

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(4);

        System.out.println(isSorted(head2));
    }

    public static boolean isSorted(Node head) {
        if (head == null || head.next == null)
            return true;

        boolean increasing = true;
        boolean decreasing = true;
        Node curr = head;
        while (curr.next != null) {
            if (curr.data > curr.next.data)
                increasing = false;

            if (curr.data < curr.next.data)
                decreasing = false;
            curr = curr.next;
        }
        return increasing || decreasing;
    }
}
