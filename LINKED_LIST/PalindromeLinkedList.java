package LINKED_LIST;

public class PalindromeLinkedList {

    public static void main(String[] args) {

    }
    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfStart = (fast == null) ? slow : slow.next;

        Node previous = null;
        Node current = secondHalfStart;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        Node firstHalf = head;
        Node secondHalf = previous;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
