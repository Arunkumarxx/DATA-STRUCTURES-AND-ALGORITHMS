package LINKED_LIST;

import java.util.HashMap;

public class LRUCache {

    private class Node {
        int value;
        int key;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private HashMap<Integer, Node> cache = new HashMap<>();

    private int capacity;

    private Node head = null;
    private Node tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    private void moveToHead(Node node) {
        if (head == node)
            return;
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        if (node == tail) tail = tail.prev;
        node.next = head;
        node.prev = null;
        if (head != null) head.prev = node;
        head = node;
        if (tail == null) tail = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        Node node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            if (head == null)
                head = tail = newNode;
            else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            if (cache.size() > capacity) {
                cache.remove(tail.key);
                tail = tail.prev;
                if (tail != null) tail.next = null;
            }
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
    }
}
