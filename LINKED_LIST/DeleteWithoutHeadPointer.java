package LINKED_LIST;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class DeleteWithoutHeadPointer {

    public static void deleteNode(ListNode nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.next == null)
            return;
        ListNode nextNode = nodeToDelete.next;
        nodeToDelete.value = nextNode.value;
        nodeToDelete.next = nextNode.next;
        nextNode = null;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        printList(head);

        deleteNode(head.next.next);

        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
