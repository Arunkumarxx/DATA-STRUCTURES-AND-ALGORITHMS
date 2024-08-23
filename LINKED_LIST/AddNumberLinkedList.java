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
    private static Node modification(Node num1,Node num2)
    {
        Node result=null;
        int len1=NodeLen(num1);
        int len2=NodeLen(num2);
        System.out.println(len1);
        System.out.println(len2);
        return num1;
    }
    private static int NodeLen(Node head)
    {
        Node temp=head;
        int c=0;
        if(head!=null) {
            while (temp.next != null) {
                temp = temp.next;
                ++c;
            }
        }
            return c;
    }
    public static void main(String[] args) {
        num1 = insert(4, num1);
        num1 = insert(5, num1);
        num2 = insert(3, num2);
        num2 = insert(4, num2);
        num2 = insert(5, num2);

        printList(num1);
        printList(num2);
    }
}
