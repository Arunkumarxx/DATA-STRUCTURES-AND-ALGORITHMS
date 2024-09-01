package LINKED_LIST;

import java.util.HashMap;


 public class LRUCache {

     private  class Node {
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
    HashMap<Integer,Node> hashMap =new HashMap<>();

    private Node put(Node head, int data)
    {
        if(hashMap.containsKey(data))
        {
            
        }
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
    private Node get(Node head,Node node)
    {
        Node temp=node;
        if(node.prev!=null)
            node.prev.next=node.next;
        else node=node.next;
        if(node.next!=null)
            node.next.prev=node.prev;
        head.prev=temp;
        temp.prev=null;
        temp.next=head;
        return head;
    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache();
        Node node =new Node(0);

    }

}
