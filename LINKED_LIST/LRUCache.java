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


    public static void main(String[] args) {
        LRUCache obj = new LRUCache();
        Node node =new Node(0);

    }

}
