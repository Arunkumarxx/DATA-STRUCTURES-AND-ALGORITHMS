package LINKED_LIST;

public class PairwiseSwapOfNodesInLinkedlist {

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
    private static void insertAtBegin()
    {

    }
    private static printList(Node head)
    {

    }

    public static void main(String[] args) {

    }

    private static Node pairwise_swap(Node node)
    {
        if(node==null|| node.next==null)
            return node;
        Node newHead=node.next;
        Node prev=null;
        Node curr=node;

        while(curr!=null && curr.next!=null)
        {
            Node next=curr.next;
            Node jump=curr.next.next;

            next.next=curr;
            curr.next=jump;


            if(prev!=null)
                prev.next=next;

            prev=curr;
            curr=jump;
        }
        return newHead;
    }

}
