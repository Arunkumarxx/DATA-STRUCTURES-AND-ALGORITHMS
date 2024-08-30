package LINKED_LIST;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLinkedLists {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node head;
    private static Node tail;

    private static Node insertAtBegin(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    private static void PrintList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static List<String> storeInArrayOfSublists(Node head, int groupSize) {
        List<String> result = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            StringBuilder sublist = new StringBuilder();
            int count = 0;


            while (temp != null && count < groupSize) {
                if (count > 0) {
                    sublist.append("->");
                }
                sublist.append(temp.data);
                temp = temp.next;
                count++;
            }

            result.add(sublist.toString());
        }

        return result;
    }

    public static void main(String[] args) {

        head = insertAtBegin(8, head);
        head = insertAtBegin(7, head);
        head = insertAtBegin(6, head);
        head = insertAtBegin(5, head);
        head = insertAtBegin(5, head);
        head = insertAtBegin(4, head);
        head = insertAtBegin(3, head);
        head = insertAtBegin(2, head);
        head = insertAtBegin(1, head);

        PrintList(head);

        List<String> nodeArray = storeInArrayOfSublists(head, 3);
        System.out.println("Array of node sublists: " + nodeArray);
    }
}
