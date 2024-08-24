package LINKED_LIST;

public class CheckIdenticalLinkedList {

    private static class  Node
    {
        int data;
        Node next;

        Node (int data)
        {
        this.data=data;
        this.next=null;
        }
    }
    private static Node insert(int data,Node head)
    {

    }

    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        while(head1!=null && head2!=null)
        {
            if(head1.data!=head2.data)
                return false;
            head1=head1.next;
            head2=head2.next;
        }
        if (head1 != null || head2 != null)
            return false;
        return true;

    }
    public static void main(String[] args) {

    }

}
