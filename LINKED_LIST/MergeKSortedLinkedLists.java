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
        merge(nodeArray,0,nodeArray.size()-1);
        printList(nodeArray);
    }
    private static Node merge(List<Node> list,int left,int right)
    {
        if(left==right)
            return list.get(left);
        int mid=left+right/2;
        Node l1=merge(list,left,mid);
        Node l2=merge(list,mid+1,right);
        return mergeTwoList(l1,l2);
    }
    private static Node mergeTwoList(Node l1,Node l2)
    {
        Node temp=new Node(0);
        Node curr=temp;
        while(l1!=null && l2!=null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1!=null)
            curr.next=l1;
        if(l2!=null)
            curr.next=l2;
        return temp.next;
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
