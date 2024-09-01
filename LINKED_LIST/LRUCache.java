package LINKED_LIST;

import java.util.HashMap;


 public class LRUCache {

     private class Node {
         int data;
         Node next;
         Node prev;

         Node(int data) {
             this.data = data;
             this.next = null;
             this.prev = null;
         }
     }

     private HashMap<Integer, Node> cache = new HashMap<>();
     private int capacity;
     private Node head = null;
     private Node tail = null;

     public LRUCache(int capacity)
     {
         this.capacity=capacity;
     }

     private void moveToHead(Node node)
     {
         if(head==node)
             return;
         if(node.prev!=null) node.prev.next=node.next;
         if(node.next!=null) node.next.prev=node.prev;

         node.next=head;
         node.prev=null;

         if(head!=null)
             head.prev=node;
         head=node;
         if(tail==null) tail=head;
     }
     private int get(int key)
     {
         if(!cache.containsKey(key)) return -1;
         Node get=cache.get(key);
         moveToHead(get);
         return get.data;
     }
     private  void put(int key,int value)
     {
         
     }
    public static void main(String[] args) {
        LRUCache obj = new LRUCache();
        Node node =new Node(0);

    }

}
