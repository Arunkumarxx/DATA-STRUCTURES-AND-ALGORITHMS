package LINKED_LIST;

import java.util.HashMap;

public class FindLengthOfLoop {
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

    private static void createLoop(int startData) {
        Node loopStartNode = null;
        Node temp = head;

        while (temp != null) {
            if (temp.data == startData) {
                loopStartNode = temp;
                break;
            }
            temp = temp.next;
        }

        if (loopStartNode != null) {
            tail.next = loopStartNode;
        }
    }

    private static void printList(int maxIterations) {
        Node temp = head;
        int count = 0;
        while (temp != null && count < maxIterations) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println();
    }

    private static void lengthOfLoopBruteForce() {
        HashMap<Node, Integer> hashMap = new HashMap<>();
        Node temp = head;
        int k = 0;
        while (temp != null) {
            if (hashMap.containsKey(temp)) {
                System.out.println("Length of loop: " + (k - hashMap.get(temp)));
                return;
            }
            hashMap.put(temp, k);
            temp = temp.next;
            k++;
        }
        System.out.println("No loop found.");
    }
    private static void lengthOfLoopOptimal()
    {
        Node slow=head;
        Node fast=head;
        boolean hasloop =false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                hasloop=true;
                break;
            }
        }
        if(!hasloop)
            System.out.println("No loops found");
        Node temp=slow;
        int len=0;

        do{
            temp=temp.next;
            len++;
        }
        while(temp!=slow);

        System.out.println(len);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; ++i) {
            insertAtEnd(i);
        }
        createLoop(5);
        printList(15);
//        lengthOfLoopBruteForce();
        lengthOfLoopOptimal();
    }
}
