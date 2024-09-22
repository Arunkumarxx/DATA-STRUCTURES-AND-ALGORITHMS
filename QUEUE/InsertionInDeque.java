package QUEUE;

import java.util.ArrayDeque;

public class InsertionInDeque {
    private class DequeNode{
        int data;
        DequeNode next;
        DequeNode prev;
        DequeNode(int value)
        {
            this.data=value;
            this.next=null;
            this.prev=null;
        }
    }
    DequeNode front,rear;
    private void addFirst(int value)
    {
        DequeNode newNode =new DequeNode(value);
        if(front==null)
            front=rear=newNode;
        else
        {
            front.prev=newNode;
            newNode.next=front;
            front=newNode;
        }
    }
    private int pop()
    {
        
    }
    private void addLast(int value)
    {
        DequeNode newNode = new DequeNode(value);
        if(rear==null)
            front=rear=newNode;
        else
        {
            rear.next=newNode;
            newNode.prev=rear;
            rear=newNode;
        }
    }
    private boolean isEmpty()
    {
        return rear==null;
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> q =new ArrayDeque<>();
    }

}
