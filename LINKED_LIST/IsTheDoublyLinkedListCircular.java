package LINKED_LIST;

public class IsTheDoublyLinkedListCircular {

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {

            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            Node tail = head.prev;

            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }

        return head;
    }
    public static void main(String[] args) {
        
    }
    public static boolean isCircular(Node head)
    {
        return head.prev!=null?true:false;
    }

}
