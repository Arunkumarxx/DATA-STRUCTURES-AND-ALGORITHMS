package LINKED_LIST;

public class IntersectionPointInYShapedLinkedLists {
    private static Node head;
    private static class Node
    {

    }
    private static Node insertAtBegin(Node head)
    {

    }
    public static void main(String[] args) {

    }
    private static int intersectPoint(Node firstHead, Node secondHead) {
        Node first = firstHead;
        Node second = secondHead;
        while(first!=second){
            first = (first.next!=null)?first.next:secondHead;
            second = (second.next!=null)?second.next:firstHead;
        }
        return first.data;
    }
}
