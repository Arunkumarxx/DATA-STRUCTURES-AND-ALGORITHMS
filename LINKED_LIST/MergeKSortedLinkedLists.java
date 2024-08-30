package LINKED_LIST;

import javax.swing.undo.UndoableEdit;
import java.util.ArrayList;
import java.util.Collections;
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

            // Build the sublist string (e.g., "1->2->3")
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

        insertAtEnd(1);
        insertAtEnd(4);
        insertAtEnd(5);
        insertAtEnd(1);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(2);
        insertAtEnd(6);
        PrintList(head);
        List<String> nodeArray = storeInArrayOfSublists(head, 3);

        System.out.println("Array of node sublists: " + nodeArray);
    }

}
