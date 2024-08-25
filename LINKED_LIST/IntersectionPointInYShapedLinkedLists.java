package LINKED_LIST;

public class IntersectionPointInYShapedLinkedLists {
    private static Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private static Node insertAtBegin(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static int intersectPoint(Node firstHead, Node secondHead) {
        Node first = firstHead;
        Node second = secondHead;

        while (first != second) {
            first = (first != null) ? first.next : secondHead;
            second = (second != null) ? second.next : firstHead;
        }
        return first != null ? first.data : -1;
    }

    public static void main(String[] args) {
        Node firstHead = null;
        Node secondHead = null;
        firstHead = insertAtBegin(firstHead, 30);
        firstHead = insertAtBegin(firstHead, 15);
        firstHead = insertAtBegin(firstHead, 9);
        firstHead = insertAtBegin(firstHead, 6);
        firstHead = insertAtBegin(firstHead, 3);
        secondHead = insertAtBegin(secondHead, 10);
        secondHead.next = firstHead.next.next;
        int intersectionPoint = intersectPoint(firstHead, secondHead);

        if (intersectionPoint != -1)
            System.out.println("The intersection point is " + intersectionPoint);
         else
            System.out.println("No intersection point");
    }
}
