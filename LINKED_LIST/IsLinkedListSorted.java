package LINKED_LIST;

public class IsLinkedListSorted {
    public static void main(String[] args) {

    }
    public static boolean isSorted(Node head)
    {
        if(head==null || head.next==null)
            return true;

        boolean increasing=true;
        boolean decreasing=true;
        Node curr=head;
        while(curr.next!=null)
        {
            if(curr.data>curr.next.data)
                increasing=false;

            if(curr.data<curr.next.data)
                decreasing=false;
            curr=curr.next;
        }
        return  increasing||decreasing;
    }
}
