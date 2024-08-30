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

    private static List<Node> storeInArrayOfSublists(Node head, int groupSize) {
        List<Node> result = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            Node sublistHead = temp;
            int count = 0;

            while (temp != null && count < groupSize - 1) {
                temp = temp.next;
                count++;
            }

            if (temp != null) {
                Node nextSublistHead = temp.next;
                temp.next = null;
                temp = nextSublistHead;
            }

            result.add(sublistHead);
        }

        return result;
    }

    private static Node merge(List<Node> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return mergeHelper(list, 0, list.size() - 1);
    }

    private static Node mergeHelper(List<Node> list, int left, int right) {
        if (left == right) {
            return list.get(left);
        }

        int mid = (left+right)/2;
        Node l1 = mergeHelper(list, left, mid);
        Node l2 = mergeHelper(list, mid + 1, right);

        return mergeTwoLists(l1, l2);
    }

    private static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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

        List<Node> nodeArray = storeInArrayOfSublists(head, 3);
        Node mergedHead = merge(nodeArray);
        printList(mergedHead);
    }
}
