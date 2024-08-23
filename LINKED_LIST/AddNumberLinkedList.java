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


        num2 = insert(3, num2);


        num1= reverse(num1);
        num2= reverse(num2);

        Node res= Add(num1,num2);

        printList(res);
        System.out.println();
        printList(num1);
        printList(num2);
    }
}
