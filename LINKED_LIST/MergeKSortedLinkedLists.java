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

    private static List<int[]> storeInArrayOfSublists(Node head, int groupSize) {
        List<int[]> result = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            int[] sublist = new int[groupSize];
            int count = 0;

            while (temp != null && count < groupSize) {
                sublist[count] = temp.data;
                temp = temp.next;
                count++;
            }

            if (count < groupSize) {
                int[] truncatedSublist = new int[count];
                System.arraycopy(sublist, 0, truncatedSublist, 0, count);
                result.add(truncatedSublist);
            } else {
                result.add(sublist);
            }
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

        List<int[]> nodeArray = storeInArrayOfSublists(head, 3);

        System.out.println("Array of node sublists:");
        for (int[] sublist : nodeArray) {
            for (int value : sublist) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
