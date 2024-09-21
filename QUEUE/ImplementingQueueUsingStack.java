package QUEUE;


import java.util.Stack;

public class ImplementingQueueUsingStack {
    Stack<Integer> stack1 =new Stack<>();
    Stack<Integer> stack2= new Stack<>();

    private void push(int value)
    {
        stack1.push(value);
    }
    private int pop()
    {
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

    }

}
