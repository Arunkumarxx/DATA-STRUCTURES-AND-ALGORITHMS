package LINKED_LIST;

public class FindMiddleOfCircularDoublyLinkedList {

    public static void main(String[] args) {

    }
    public static int findMiddle(Node head)
    {
        Node slow=head;
        Node fast=head.next;

        while(fast!=head)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
