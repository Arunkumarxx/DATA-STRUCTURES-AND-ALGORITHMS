package LINKED_LIST;

class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node()
    {

    }
}

public class TraversingALinkedList {
    Node node =new Node();
    Node head=node;
    private  void insertAtBegin (int data)
    {
        if(head==null) {
            Node newNode = new Node(data);
        }
        else {
            Node newNode =new Node(data);
            newNode.next=head;
            head.next=newNode;
        }
    }
    private void printList()
    {
        Node itr=head;
        while(itr!=null)
        {
            System.out.println(itr.data);
            itr=itr.next;
        }
    }
    public static void main(String[] args) {
        TraversingALinkedList list  =new TraversingALinkedList();
        Node node =new Node();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.printList();

    }

}
