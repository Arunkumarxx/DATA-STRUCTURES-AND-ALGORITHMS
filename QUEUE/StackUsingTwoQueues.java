package QUEUE;

import java.util.LinkedList;
import java.util.Queue;


public  class StackUsingTwoQueues {
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2 =new LinkedList<>();

    private void push(int value)
    {
        q2.add(value);

            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            Queue<Integer> temp =q1;
            q1=q2;
            q2=temp;
        }
    }
    private int pop()
    {

    }
    public static void main(String[] args) {
        StackUsingTwoQueues stack =new StackUsingTwoQueues();

        stack.push(2);
        stack.push(2);
        stack.push(2);

    }

}
