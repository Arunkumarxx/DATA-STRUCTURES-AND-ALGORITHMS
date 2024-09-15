package STACK;

public class InfixToPostfix {
    private StackNode head;
    private class StackNode {
        int value;
        StackNode next;
        StackNode(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    private void push(int value)
    {
        StackNode newNode =new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private int top()
    {
        return head.value;
    }
    private int pop()
    {
        int res=head.value;
        head=head.next;
        return res;
    }
    private void clear()
    {
        head=null;
    }
    private void print()
    {
        StackNode temp =head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        InfixToPostfix stack =new InfixToPostfix();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.print();
    }

}
