package LINKED_LIST;

public class JoinTwolinkedList {

    private static Node head;
    private static class Node
    {

    }
    private static Node insert(Node head)
    {

    }
    private static void PrintList(Node head)
    {

    }

    public static Node joinTheLists(Node head1, Node head2)
    {
        if(head1==null)
            return head2;

        Node t1=head1;
        while(t1.next!=null)
            t1=t1.next;

        t1.next=head2;
        return head1;
    }
    public static void main(String[] args) {

    }

}
