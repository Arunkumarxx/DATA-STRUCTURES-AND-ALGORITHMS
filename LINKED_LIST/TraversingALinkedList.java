package LINKED_LIST;

public class TraversingALinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node()
        {
            head=null;
        }
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        private static void  insertAtBegin(int data)
        {
            Node newNode =new Node(data);
        }
    }

    public static void main(String[] args) {
        TraversingALinkedList  list =new TraversingALinkedList();
        insertAtBegin();
    }

}
