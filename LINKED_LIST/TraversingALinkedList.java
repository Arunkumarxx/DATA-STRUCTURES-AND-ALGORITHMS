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

    private  void insertAtBegin (Node head,int data)
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

    public static void main(String[] args) {
        TraversingALinkedList list  =new TraversingALinkedList();
        Node node =new Node();
        list.insertAtBegin(node,10);
        
    }

}
