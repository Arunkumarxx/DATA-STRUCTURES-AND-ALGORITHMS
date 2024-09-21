package QUEUE;


import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Stack;

public class ImplementingQueueUsingStack {
    Stack<Integer> stack1 =new Stack<>();
    Stack<Integer> stack2= new Stack<>();

    private void enqueue(int value)
    {
        stack1.push(value);
    }
    private int dequeue()
    {
        if(stack1.isEmpty() && stack2.isEmpty())
            return -1;
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        ImplementingQueueUsingStack Queue =new ImplementingQueueUsingStack();
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);
        Queue.dequeue(
        System.out.println();

    }

}
