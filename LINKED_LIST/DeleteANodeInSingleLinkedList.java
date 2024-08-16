package LINKED_LIST;

public class DeleteANodeInSingleLinkedList {

    public static void main(String[] args) {
        LINKED_LIST list = new LINKED_LIST();
        for(int i=0; i<10; ++i)
            list.insertAtBeginning(i);
        delete(2,list);
        list.printList();
    }
    private static void delete (int ind,LINKED_LIST list)
    {
        if(list.head == null)
            return;

        if(ind==1)
            list.head= list.head.next;

        LINKED_LIST.Node temp = list.head;

        for(int i=1; temp!=null&& i<ind; ++i)
        {
            temp=temp.next;
        }

        if(temp==null || temp.next==null)
            return;

        if(temp.next!=null && temp.next.next!=null)
            temp.next=temp.next.next;
    }

}
