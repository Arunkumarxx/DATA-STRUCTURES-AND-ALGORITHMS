package LINKED_LIST;

public class SearchInALinkedListIterativeAndRecursive {

    private static Node head;
    private static Node tail;

    private static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        Node()
        {}
    }

    private static void insert(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    private static void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    private static boolean recursiveSearch(int key,Node node)
    {
        if(node==null)
            return false;
        if(node.data==key)
            return true;
       return recursiveSearch(key,node.next);
    }

    private static boolean IterativeSearch(int key,Node node)
    {
        while(node!=null)
        {
            if(key==node.data)
                return true;
            node=node.next;
        }
        return false;
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            insert(i);
        printList();
        System.out.println(recursiveSearch(8,head));
        System.out.println( IterativeSearch(7,head));

    }


}
