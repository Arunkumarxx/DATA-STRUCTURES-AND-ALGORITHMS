package LINKED_LIST;

public class CloneALinkedListWithNextAndRandomPointer {

    public static void main(String[] args) {

    }
    Node copyList(Node head) {
        if (head == null) return null;

        Node current = head;
        while (current != null) {
            Node copy = new Node(current.data);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }


        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        current = head;
        Node dummy = new Node(0);
        Node copyCurrent = dummy;

        while (current != null) {
            Node copy = current.next;
            copyCurrent.next = copy;
            copyCurrent = copy;

            current.next = copy.next;
            current = current.next;
        }

        return dummy.next;
    }
}
