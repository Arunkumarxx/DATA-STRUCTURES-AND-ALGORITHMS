package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingTwoQueues {
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2 =new LinkedList<>();

    private void push(int value)
    {
        q2.add(value);
        if(q1.isEmpty())
        {
            q1.add(q2.poll());
        }
        else
        {
            
        }
    }
    private int pop()
    {

    }
    public static void main(String[] args) {

    }

}
