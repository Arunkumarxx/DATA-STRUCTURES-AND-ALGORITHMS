package QUEUE;

import java.util.LinkedList;
import java.util.Queue;


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
        else {
            q2.add(value);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            q1 = q2;
            q2.clear();
        }
    }
    private int pop()
    {
        if(!q1.isEmpty())
            return q1.poll();
        return -1;
    }
    public static void main(String[] args) {
        StackUsingTwoQueues stack =new StackUsingTwoQueues();
        stack.push(2);
        stack.push(2);
        stack.push(2);
        System.out.println(stack.pop());
    }

}
