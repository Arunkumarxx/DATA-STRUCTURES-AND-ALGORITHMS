package LINKED_LIST;

public class RecursiveTraversalOfSinglyLinkedList {
    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        PrintListUsingRecursion(head);
    }
    private static void PrintListUsingRecursion(Node list)
    {
        if(list!=null)
        {
            System.out.print(list.data+" ");
            list=list.next;
        }
    }
}
