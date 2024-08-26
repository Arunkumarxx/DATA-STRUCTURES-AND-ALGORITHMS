package LINKED_LIST;

public class IsTheDoublyLinkedListCircular {

    public static void main(String[] args) {

    }
    public static boolean isCircular(Node head)
    {
        return head.prev!=null?true:false;
    }
}
