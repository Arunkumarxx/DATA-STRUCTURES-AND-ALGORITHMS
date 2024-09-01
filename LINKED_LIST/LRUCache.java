package LINKED_LIST;
   final class Node {
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
 public class LRUCache {

    private Node insert(Node head, int data)
    {
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            return head;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        return head;
    }
    private Node remove(Node head)
    {
        
    }
    public static void main(String[] args) {
        LRUCache obj = new LRUCache();
        Node node =new Node(0);

    }

}
