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

    private static List<List<Node>> storeInArrayOfSublists(Node head, int groupSize) {
        List<List<Node>> result = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            List<Node> sublist = new ArrayList<>();
            int count = 0;

            while (temp != null && count < groupSize) {
                sublist.add(temp);
                temp = temp.next;
                count++;
            }

            result.add(sublist);
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

        List<List<Node>> nodeArray = storeInArrayOfSublists(head, 3);
        printList(nodeArray);
    }
    private static  void printList(List<List<Node>> nodeArray)
    {
        System.out.println("Array of node sublists:");
        for (List<Node> sublist : nodeArray) {
            for (Node node : sublist) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }

}
