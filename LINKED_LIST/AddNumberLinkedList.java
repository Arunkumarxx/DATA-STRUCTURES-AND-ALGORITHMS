package LINKED_LIST;

public class AddNumberLinkedList {
    private static Node num1 = null;
    private static Node num2 = null;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node insert(int data, Node head) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static Node  reverse(Node  head)
    {
        Node previous=null;
        Node temp=head;
        while(temp!=null)
        {
            Node next=temp.next;
            temp.next=previous;
            previous=temp;
            temp=next;
        }
        return  previous;
    }

    private static Node insertAtBegin(int data,Node head)
    {
        Node newNode= new Node(data);
            newNode.next=head;
            head=newNode;
        return head;
    }

    private static Node  Add(Node num1,Node num2)
    {
        num1= reverse(num1);
        num2= reverse(num2);
        Node result = null;
        int carry=0;
        while(num1!=null || num2!=null || carry!=0) {
            int sum = carry;

            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
            carry=sum/10;
           result= insertAtBegin(sum%10,result);
        }
        return result;
    }

    public static void main(String[] args) {
        num1 = insert(4, num1);
        num1 = insert(5, num1);
        num2 = insert(3, num2);
        num2 = insert(4, num2);
        num2 = insert(5, num2);
        printList(num1);
        printList(num2);
        Node res=Add(num1,num2);
        System.out.println();
        printList(res);
    }
}

/*
Add Number Linked Lists
Difficulty: MediumAccuracy: 34.52%Submissions: 283K+Points: 4
Given two numbers, num1, and num2, represented by linked lists. The task is to return the head of the linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Examples:

Input: num1 = 45 (4->5->null), num2 = 345 (3->4->5->null)
Output:  3->9->0->null

Explanation:
For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (3 9 0).
Input: num1 = 0063 (0->0->6->3->null), num2 = 07 (0->7->null)
Output: 7->0->null

Explanation:
For the given two linked list (0 0 6 3) and (0 7), after adding the two linked list resultant linked list will be (7 0).
Expected Time Complexity: O(n+m)
Expected Space Complexity: O(max(n,m)) for the resultant list.




 */
