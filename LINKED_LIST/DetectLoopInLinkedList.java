package LINKED_LIST;

public class DetectLoopInLinkedList {

    private static Node head;
    private static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static boolean isLoopFound(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

     head=new Node(1);
     head.next=new Node(2);
     head.next.next=new Node(3);
     head.next.next.next=new Node(4);
     head.next.next.next.next=new Node(5);
     head.next.next.next.next.next=head.next;
        System.out.println(isLoopFound(head));
    }

}
