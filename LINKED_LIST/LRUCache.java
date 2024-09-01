package LINKED_LIST;

public class LRUCache {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    private Node insert(Node head, int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            
        }
    }
    public static void main(String[] args) {

    }

}
