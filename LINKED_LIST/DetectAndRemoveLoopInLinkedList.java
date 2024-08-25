package LINKED_LIST;

public class DetectAndRemoveLoopInLinkedList {

    private static Node head;
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static Node DetectLoopAndRemoveLoop(Node head)
    {
        boolean isLoopFound=false;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                isLoopFound = true;
                break;
            }
        }
        if(isLoopFound)
        {
            slow=head;
            while(slow!=fast) {
                slow = slow.next;
                fast = fast.next;
            }

            while(fast.next!=slow)
                fast.next=fast;
            fast.next=null;
        }
        return head;
    }
    private static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=head.next;

        head= DetectLoopAndRemoveLoop(head);

        printList(head);

    }

}
